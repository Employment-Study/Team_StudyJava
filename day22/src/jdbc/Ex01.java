package jdbc;

// JDBC : Java Database Connectivity
// 자바를 이용하여 DB에 연결하는데 필요한 라이브러리

// ojdbc : Oracle DB에 접속하기 위한 JDBC라이브러리

import java.sql.*;
import oracle.jdbc.driver.OracleDriver;

public class Ex01 {
	public static void main(String[] args) throws Exception {
		
		
		// DB에 접속한 이후 실행할 SQL
		String sql = "select * from product order by idx";
//		String sql = "select * from product where price >= 2000";
//		String sql = "select * from product where name like '%캔%'";
		
		// 특정 벤더사 DB에 접속하기 위한 드라이버 클래스 이름(여기서는 오라클)
		String className = OracleDriver.class.getName();
		
		// DB서버에 접속하기 위한 주소 (접속방식:@IP주소:포트번호:xe(Express Edition))
		String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
		// 접속에 사용되는 Oracle서버의 계정과 비밀번호
		String user = "c##itbank";
		String password = "it";
		
		System.out.println(className);

		// 드라이버 클래스를 메모리에 불러온다
		Class.forName(className);
		
		// 주소와 계정, 비밀번호를 전달하여 DB접속을 시도한다.
		Connection conn = DriverManager.getConnection(url, user, password);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		System.out.println("idx\t\tname\t\t price\t expireDate\t memo");
		System.out.println("=======================================================================");
		while (rs.next()) {
			// 결과 집함은 여러 줄()로 구성되어있다. Scanner와 마찬가지로 다음줄이 있으면 반복한다.
			int idx = rs.getInt("idx");										// idx 컬럼의 값을 정수형태로 가져온다.
			String name = rs.getString("name");			// name컬럼의 값을 문자열 형태로 가져온다.
			int price = rs.getInt("price");								// price 컬럼의 값을 정수 형태로 가져온다.
			String memo = rs.getString("memo");			// memo의 컬럼의 값을 문자열 형태로 가져온다.
			Date expireDate = rs.getDate("expireDate");
			// 현재 가져온 데이터들을 내용에 맞게 출력한다.
			System.out.printf("%02d %20s\t %,10d\t %s\t %s \n", idx, name, price, expireDate, memo);
		}
		System.out.println("=======================================================================");
		// 작업이 끝났으면, 연결할 때의 역순으로 close해줘야한다.
		rs.close();					// close()를 제대로 수행하지 않으면
		stmt.close();				//
		conn.close();				//
	}
}
