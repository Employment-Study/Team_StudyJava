package control;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		// 서로 다른 세 정수를 입력받아서 가장 큰 수를 출력하세요
		// 만약 같으면 아무 수나 출력해도 됩니다
		
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3, max;
		
		System.out.print("세 정수를 띄어쓰기로 구분하여 입력 : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		System.out.printf("%d, %d, %d\n", n1, n2, n3);
		
		max = n1;		// n1 이 가장 크다고 가정한다
		
		if(max < n2) {	// 만약, n2가 더 크면
			max = n2;	// n2의 값을 최대값으로 지정한다
		}
		if(max < n3) {	// 만약, n3가 더 크면 (이전 if의 실행여부와 상관없이 무조건 체크한다)
			max = n3;	// n3의 값을 최대값으로 지정한다
		}
		System.out.println("최대값 : " + max);
		
		sc.close();
	}
}






