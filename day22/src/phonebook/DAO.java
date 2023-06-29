package phonebook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DAO { // Data Access Object : DB의 데이터에 접근하기 위한 객체
	private final String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	private final String user = "c##itbank";
	private final String password = "it";
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private Statement stmt = null;
	private ResultSet rs = null;

	// 기본 생성자
	public DAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패 : " + e);
		}
	}

	// Connection을 반환하는 함수
	private Connection getConnection() throws SQLException {
		Connection conn = null;
		conn = DriverManager.getConnection(url, user, password);
		return conn;
	}

	// Connection, Statement, ResultSet을 역순으로 닫는 함수
	private void close() {
		try {
			if (rs != null)
				rs.close();
		} catch (Exception e) {
		}
		try {
			if (stmt != null)
				stmt.close();
		} catch (Exception e) {
		}
		try {
			if(pstmt!=null) {
				pstmt.close();
			}
		}catch(Exception e) {
		}
		try {
			if (conn != null)
				conn.close();
		} catch (Exception e) {
		}
		
	}
	
	// Phone형태의 데이터를 mapping하는 함수
	private DTO mapper(ResultSet rs) throws SQLException {
		DTO dto  = new DTO();
		dto.setName(rs.getString("name"));
		dto.setAge(rs.getInt("age"));
		dto.setPnum(rs.getString("pnum"));
		return dto;
	}
	
	// 전체 목록()
	public ArrayList<DTO> selectAll() {
		ArrayList<DTO> list = new ArrayList<>();
		String sql = "select * from phonebook order by name";
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				list.add(mapper(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}		
		return list;
	}
	
	// 단일 조회(String name)
	public DTO select(String name) {
//		String sql = "select * from phonebook  where name = \'"+name+"\' order by name";
		String sql = "select * from phonebook  where name = ? order by name";
		DTO dto = null;
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dto = mapper(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}		
		return dto;
	}	
	// 검색 (String name)
	public ArrayList<DTO> search(String name) {
		ArrayList<DTO> list = new ArrayList<>();
//		String sql = "select * from phonebook  where name = \'"+name+"\' order by name";
		String sql = "select * from phonebook  where name like '%' || ? || '%' order by name";
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
//				DTO dto = new DTO();
//				dto.setName(rs.getString("name"));
//				dto.setAge(rs.getInt("age"));
//				dto.setPnum(rs.getString("pnum"));
				list.add(mapper(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}		
		return list;
	}
	// 추가 (DTO)
	public int insert(DTO dto) {
		int row= 0;
		String sql = "insert into phonebook values(?, ?, ?)";
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getAge());
			pstmt.setString(3, dto.getPnum());
			row = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}		
		return row;
	
	}
	// 수정 (DTO)
	public int update(DTO dto,String name) {
		int row= 0;
		String sql = "update phonebook set name=?,age= ?, pnum=? where name = ?";
//		String sql2 = "update phonebook set name = '%s', age = %s, pnum = '%s' where name='%s'";
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getAge());
			pstmt.setString(3, dto.getPnum());
			pstmt.setString(4,name);
			row = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}		
		return row;
	}
	// 삭제 (String name)
	public int delete(String name) {
		int row= 0;
		String sql = "delete from phonebook where name = ?";
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,name);
			row = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}		
		return row;
	}
	// 이름으로 존재여부 확인
	public boolean isIn(String name) {
		boolean flag = false;
		String sql = "select * from phonebook  where name = ?";
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				flag = true;
				break;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
		return flag;
	}
	
}
