package loop;

import java.util.Random;

public class Ex08 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		int begin = ran.nextInt(10) + 1;
		int end = ran.nextInt(10) + 1000;
		
		System.out.printf("begin : %d, end : %d\n", begin, end);
		
		// 두 정수의 합계 구하기 (반복문)
		int total = 0;
		int n1 = begin;
		while(n1 <= end) {
			total += n1;
			n1++;
		}
		System.out.println("total : " + total);
		
		// 두 정수의 합계 구하기 (등차수열의 합)
		int sum = (begin + end) * (end - begin + 1) / 2;
		System.out.println("sum : " + sum);
		
	}
}
