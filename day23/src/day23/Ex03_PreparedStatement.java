package day23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex03_PreparedStatement {
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
		
		
		String sql = "select * from product where name = ?";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url, user, password);
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, search);
		ResultSet rs = pstmt.executeQuery();
		
		System.out.println("sql : "+sql);
		while(rs.next()) {
			isEmpty = false;
			System.out.println("상품 이름 : "+ rs.getString("name"));
			System.out.printf("상품 가격 : %,d원 \n",Integer.parseInt(rs.getString("price")));
		}
		
		if(isEmpty) {
			System.out.println(search + "는 DB에 없는것 같습니다!");
		}
		
		
		// pstmt  - stmt의 가독성을 높이면서 sql injection도 방지해준다.
		rs.close();
		pstmt.close();
		conn.close();
		sc.close();
	}
}
