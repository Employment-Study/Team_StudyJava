package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 0, n2 = 0, sum = 0;
		
		// try catch를 사용하면 예외코드를 건너뛰고
		// 다음 코드를 실행할 수 있다.
		
		try {// 예외 발생 가능성이 있는 코드들을 묶어 놓는 영역
			System.out.print("정수1 입력 >");
			n1  = sc.nextInt();
			
			System.out.print("정수2 입력 >");
			n2  = sc.nextInt();
			
			sum = n1 + n2;
			System.out.println("sum : "+sum);
			
		}catch (InputMismatchException e) {		// 특정 타입의 예외가 발생하면 처리 코드를 작상하는 영역
			System.err.println("입력 형식이 잘못되었습니다.");
			System.out.println(e.toString());
		}finally {		// 예외 발생 여부에 상관없이 반드시 수행하는 영역
			sc.close();
		}
		
		System.out.println("프로그램 종료");
		
		sc.close();
		
	}
}