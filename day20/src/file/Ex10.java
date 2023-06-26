package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("경로 입력 : ");
		String url = sc.nextLine();								// 웹페이지에서 주소를 복사하여 넣기
		
		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
		String contentType = conn.getContentType();
		int fileSize = conn.getContentLength();
		String fileName = "test.";
		fileName += contentType.split("/")[1];
		
		byte[] buf = new byte[1024];
		int b= 0;
		int total = 0;
		InputStream is = conn.getInputStream();
		FileOutputStream fos = new FileOutputStream(new File(fileName));
		
		// 불러온 데이터가 -1이 아니라면 계속 반복한다. (-1 : End of File, 파일의 끝)
		while((b = is.read(buf, 0, 1024)) != -1) {
			total += b;																				// 이번 반복에 다운로드 받은 크기를 total에 더한다.
			int rate = total * 100 / fileSize;										// 누적 바이트에 전체 크기와 계산하여 퍼센트를 구한다
			fos.write(buf,0,b);																// 다운받은 만큼을 파일에 기록한다.
			System.out.printf("%d %d (%d%%) \n ",total, fileSize, rate);
		}
		fos.flush();
		fos.close();
	}
}
