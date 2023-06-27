package socket;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String target;
		String data="";
		
		System.out.print("접속할 서버의 ip를 입력 : ");
		target = sc.nextLine();
		
		// IP와 port번호로 서버와 통신할 소켓을 생성
		Socket so = new Socket(target,7777);
		PrintWriter pw = new PrintWriter(so.getOutputStream());		// 메시지를 보내기 위해
		while(true) {
			System.out.print("보낼 메시지를 입력 : ");
			data = sc.nextLine();
			if(data.equals("exit")) {
				pw.write(data+"\n");
				break;
			}
			pw.flush();
		}
		
		
		pw.close();
		so.close();
		sc.close();
	}
}
