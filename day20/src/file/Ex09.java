package file;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) throws Exception {
		
		// 프로젝트 폴더에 ex09.txt 파일을 생성한 다음
		// FileWriter를 이용하여 본인의 이름과 생일을 기록하세요
		// 이름 한 줄, 생일은 월과 일만 두번째 줄에 기록하세요
		
		
		// Scanner를 이용하여 대상 파일을 읽어서 
		// 한 줄 씩 화면에 출력하세요
		
		File file = new File("ex09.txt");
		Scanner sc = new Scanner(System.in);
		
		if(file.exists() == false) {
			file.createNewFile();
		}
		
		String birth;
		FileWriter fw = new FileWriter(file);
		System.out.print("본인의 이름을 입력하세요 >> ");
		fw.append(sc.nextLine()+"\n");
		
		System.out.print("본인의 생일을 입력하세요 >> ");
		birth = sc.nextLine();
		
		fw.append(birth);
//		fw.append(birth.split("월")[0]+"월");
//		fw.append(birth.split("월")[1].split("일")[0]+"일");
		fw.flush();
		
		
		Scanner fsc = new Scanner(file);
		while(fsc.hasNextLine()) {
			System.out.println(fsc.nextLine());
		}
		
		sc.close();
		fsc.close();
		System.out.println(file.getAbsolutePath());
		String command = "notepad \"" + file.getAbsolutePath()+"\"";
		Process pro = Runtime.getRuntime().exec(command);
		Thread.sleep(5000);
		pro.destroy();
	}
}
