package student;

import java.sql.*;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class StudentDAO {
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private Context init;
	private DataSource ds;
	
	private static StudentDAO instance;
	
	public static StudentDAO getInstance() {
		if(instance == null) {
			instance = new StudentDAO();
		}
		return instance;
	}
	private StudentDAO() {
		
		try {
			init = new InitialContext();
			ds = (DataSource)init.lookup("java:comp/env/jdbc/oracle");
		} catch (NamingException e) {
			System.err.println("Naming에러");
		}
	}
	
	public ArrayList<StudentDTO> selectList() {
		ArrayList<StudentDTO> list = new ArrayList<StudentDTO>();
		String sql = "select student.*, (kor+eng+math) as total, trunc(kor+eng+math/3,1) as avg from student";
		
		try{
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				StudentDTO dto = new StudentDTO(rs.getString("name"), rs.getInt("kor"), rs.getInt("eng"), rs.getInt("math"), rs.getInt("total"), rs.getDouble("avg"));
				
				list.add(dto);
			}
			
		} catch (SQLException e) {
			System.out.println("sql예외 : " +e);
		}finally {
			
			if(rs!=null)
				try {
					rs.close();
					if(pstmt!=null) pstmt.close();
					if(conn!=null)conn.close();
				} catch (SQLException e) {
					System.err.println("close:" +e);
				}
		}
		return list;
		
	}
	
	public int insert(StudentDTO dto) {
		int row=0;
		String sql = "insert into student values(?,?,?,?)";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getKor());
			pstmt.setInt(3, dto.getEng());
			pstmt.setInt(4, dto.getMath());
			
			row = pstmt.executeUpdate();
			System.out.println(row+"행 입력됨");
		} catch (SQLException e) {
			System.err.println("SQL에러 : "+e);
		}
		
		
		return row;
	}
	
	public StudentDTO search(StudentDTO dto) {
		int row=0;
		String sql = "select student.*, (kor+eng+math) as total, trunc(kor+eng+math/3,1) as avg from student "
				+ "where name=?";
		StudentDTO dto2 = null;
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			rs = pstmt.executeQuery();
			if(rs.next()) {
			dto2 = new StudentDTO(rs.getString("name"), rs.getInt("kor"), rs.getInt("eng"), rs.getInt("math"), rs.getInt("total"), rs.getDouble("avg"));
			}
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			
			if(rs!=null)
				try {
					rs.close();
					if(pstmt!=null) pstmt.close();
					if(conn!=null)conn.close();
				} catch (SQLException e) {
					System.err.println("close:" +e);
				}
		}
		
		return dto2;
		
	}
	
	public int delete(StudentDTO dto) {
	int row=0;
	String sql ="delete student where name=?";
	
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			
			row = pstmt.executeUpdate();
			System.out.println(row+"개 삭제");
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			
			if(rs!=null)
				try {
					rs.close();
					if(pstmt!=null) pstmt.close();
					if(conn!=null)conn.close();
				} catch (SQLException e) {
					System.err.println("close:" +e);
				}
		}
		
		
		return row;
	}
	
	
}
