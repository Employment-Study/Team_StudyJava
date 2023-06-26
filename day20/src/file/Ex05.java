package file;

import java.io.File;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) throws IOException {		// 파일입출력에서 발생할 수 있는 예외를 throws한다.
		File f1 = new File("a.txt");
		File f2 = new File("C:\\upload", "b.txt");
		File dir = new File("C:\\upload");
		File f3 = new File(dir,"c.txt");
		
		// 자바에서 파일 객체를 생성한다고 해서, 실제 디스크에 파일이 만들어지는 것이 아니다!!
		
		System.out.println("f1 이 존재하는가 : "+f1.exists());
		System.out.println("f2 이 존재하는가 : "+f2.exists());
		System.out.println("dir 이 존재하는가 : "+dir.exists());
		System.out.println("f3 이 존재하는가 : "+f3.exists());
		System.out.println();
		
		if(!f1.exists()) {
			boolean flag1 = f1.createNewFile();
			System.out.println("f1이 생성되었는가?? : "+flag1 );
		}else {
			f1.delete();
		}
		
		if(dir.exists()) {
			boolean flag2 = dir.delete();		// 삭제도 boolean값을 반환한다.
			System.out.println("dir가 삭제되었는가 ?? : "+flag2);
		}
		
		System.out.println("f1이 존재하는가? : "+f1.exists());
		System.out.println("f1이 읽을 수 있는가? : "+f1.canRead());
		System.out.println("f1이 쓰기 가능한가? : "+f1.canWrite());
		System.out.println("f1이 실행 가능한가? : "+f1.canExecute());
		System.out.println("f1이 파일인가? : "+f1.isFile());
		System.out.println("f1이 디렉토리인가 ? : "+f1.isDirectory());
		System.out.println();
		
		
	}
}
