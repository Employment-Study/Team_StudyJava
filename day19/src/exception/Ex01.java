package exception;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) throws Exception {
		// 프로그램 진행 중 발생하는 예외 상황을 나타내기 위한 클래스 : Exception
		
		// Throwable에는 던질 수 있는 클래스가 2개 있는데
		// Error(소스코드로는 해결할 수 없는 문제) Exception(소스코드의 수정으로 해결할 수 있는 문제)
		Scanner sc = new Scanner(System.in);
		int n1,n2, result;
		
		System.out.print("정수1 입력 : ");
//		n1 = sc.nextInt();
		String s1 = sc.next();
		
		boolean flag1 = true;
		for(int i=0;i<s1.length();i++) {
			char ch = s1.charAt(i);
			if(ch < '0' || '9' < ch) {
				flag1 = false;
				break;
			}
		}
		if(flag1 == false) {
			System.err.println("정수가 올바르게 입력되지 않앗습니다.");
			System.err.println("다시 실행해주세요");
			sc.close();
			return;
		}
		
		
		System.out.print("정수2 입력 : ");
		n2 = sc.nextInt();
		sc.nextLine();
		
		result = n2;
		System.out.println("result : "+ result);
		
		
		sc.close();
	}
}

