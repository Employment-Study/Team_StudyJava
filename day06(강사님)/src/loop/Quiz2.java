package loop;

public class Quiz2 {
	public static void main(String[] args) {
		// 1부터 100사이의 정수를 반복하여
		// 홀수의 합과 짝수의 합을 각각 구하여 출력하세요
		
		int oddSum = 0, evenSum = 0;
		int cnt = 1;
		
		while(cnt <= 100) {
			if(cnt % 2 == 0) {
				evenSum += cnt;
			}
			else {
				oddSum += cnt;
			}
			cnt++;
		}
		System.out.println("홀수의 합 : " + oddSum);
		System.out.println("짝수의 합 : " + evenSum);
	}
}
