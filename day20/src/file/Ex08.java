package file;

import java.io.File;
import java.io.FileWriter;

public class Ex08 {
	public static void main(String[] args) throws Exception{
		File f = new File("a.txt");
		if(f.exists() == false) {
			f.createNewFile();
		}
		// 기존 내용을 유지하고 아랫쪽에 내용을 추가할 것인가?(false는 새로, True는 추가)
		boolean append = false;
		
		// 텍스트를 기록할 때에는 FileWriter
		FileWriter fw = new FileWriter(f,append);
		fw.append("Hello\n");
		fw.append("world\n");
		fw.append("java\n");
		fw.append("한글\n");
		fw.flush();
		fw.close();
		
		System.out.println("완료");
	}
}
