package control;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/*
			지하철 1구간 당 평균 이동시간이 [4분]이라고 가정한다
			[이동한 구간 수]를 입력받아서, [걸린 시간]을 출력하세요
			단, [시간이 60분 이상]이면 [시간과 분을 구분]하여 출력하고
			[시간이 60분 미만]이면 [분만 출력]하세요
		 */
		
		Scanner sc = new Scanner(System.in);
		int perStation = 4;
		int station;
		int time;
		int hour, minute;
		
		System.out.print("이동한 구간 수 입력 : ");
		station = sc.nextInt();
		
		time = station * perStation;
		
		if(time >= 60) {
			hour = time / 60;
			minute = time % 60;
			System.out.printf("걸린 시간 : %d시간 %d분\n", hour, minute);
		}
		else {
			System.out.printf("걸린 시간 : %d분\n", time);
		}
		sc.close();
		
		
		
	}
}
