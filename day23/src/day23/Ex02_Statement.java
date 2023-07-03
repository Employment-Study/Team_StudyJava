package day23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex02_Statement {
	public static void main(String[] args) throws Exception {
		// PrepareStatement : Statement의 서브 클래스 (상속 관계)
		String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
		String user = "c##itbank";
		String password = "it";
		boolean isEmpty = true;

//		String sql = "select * from product where name = ?";
		Scanner sc = new Scanner(System.in);
		String search;
		System.out.print("상품 이름을 정확히 입력 : ");
		search = sc.nextLine();
		
		
		String sql = "select * from product where name = '" + search+"'";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url, user, password);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		System.out.println("sql : "+sql);
		while(rs.next()) {
			isEmpty = false;
			System.out.println("상품 이름 : "+ rs.getString("name"));
			System.out.println("상품 가격 : "+ rs.getString("price"));
		}
		
		if(isEmpty) {
			System.out.println(search + "는 DB에 없는것 같습니다!");
		}
		
		rs.close();
		stmt.close();
		conn.close();
	}
}
