package loop;

import java.util.Random;
import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		// 랜덤을 활용한 업다운 게임을 작성하세요
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int answer = ran.nextInt(100) + 1;
		int user;
		int cnt = 0;
		
		while(true) {
			System.out.print("정수 입력 (1 ~ 100) : ");
			user = sc.nextInt();
			cnt++;
			if(user > answer) {
				System.out.println("DOWN");
			}
			else if(user < answer) {
				System.out.println("UP");
			}
			else {
				break;
			}
		}
		System.out.printf("정답입니다. %d회 만에 정답을 맞췄습니다\n", cnt);
		sc.close();
	}
}
