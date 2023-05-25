package loop;

public class Ex03 {
	public static void main(String[] args) {
		
		// 1) 1부터 100 사이의 홀수의 합과 짝수의 합을 for문으로 계산하여 출력하세요
		int oddSum = 0, evenSum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				evenSum += i;
			}
			else {
				oddSum += i;
			}
		}
		System.out.printf("홀수의 합 : %d, 짝수의 합 : %d\n\n", oddSum, evenSum);
		
		// 2) A부터 Z까지 띄어쓰기로 구분하여 한 줄에 출력하세요
		// char는 글자를 표현하기 위한 정수 자료형이다
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println();
		
		// 3) 빈 문자열에 * 기호를 5번 추가하여 출력하세요
		String s = "";
		for(int i = 0; i < 5; i++) {
			s += '*';
		}
		System.out.println(s);
		
	}
}











