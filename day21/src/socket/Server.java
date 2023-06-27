package socket;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	static String getLocalIpaddr() throws Exception{
		Runtime rt = Runtime.getRuntime();
		Process pro = rt.exec("ipconfig");
		InputStream is = pro.getInputStream();
		Scanner sc = new Scanner(is, "CP949");		// Scanner
		
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			if(line.contains("IPv4")) {			// "IPv4"를 포함한다면
				sc.close();										// Scanner를close
				return line.split(" : ")[1];			// 결과에서 " : "를 기준으로 분리한 오른쪽 Value반환
			}
		}
		sc.close();
		return null;
	}
	
	public static void main(String[] args) throws Exception {
		String localAddr = getLocalIpaddr();
		
		String data="";
		System.out.println(localAddr);
		// 서버 소켓을 힙에 띄운다.
		// 소켓은 내 컴퓨터에서 다른 컴퓨터를 가리키기 위한 도구이다.
		ServerSocket ss = new ServerSocket(7777);		// TCP의 7777포트에서 서비스
		System.out.println("접속 대기 중...");
		Socket so = ss.accept();													// 계속 대기 상태
		
		// 원격지 주소를 가져온다.
		String remoteAddr = so.getInetAddress().toString();
		System.out.println(remoteAddr + " 에서 접속함");
		Scanner sc = new Scanner(so.getInputStream());
		
		while(!data.equals("exit")) {	
			data = sc.nextLine();
			System.out.println(remoteAddr + " : " + data);
		}
		
		sc.close();
		so.close();	// Socket 닫기
		ss.close();	// Service Socket 닫기
		
	}
}

