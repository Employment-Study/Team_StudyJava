package file;

import java.io.File;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) throws Exception {
		// 텍스트 파일의 내용을 읽어오기
		
		String parent = "C:\\windows\\system32\\drivers\\etc\\";
		String child=  "hosts";
		File f = new File(parent,child);
		
		System.out.println("f가 존재하는가 : "+f.exists());
		
		if(f.exists()) {	// NotFoundException은 파일이 없을 때 발생하는 
										// 예외지만 파일이 확실히 존재한다는 가정하에 실행
			Scanner sc = new Scanner(f);
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
				Thread.sleep(500);
			}
			sc.close();
		}
	}
}
