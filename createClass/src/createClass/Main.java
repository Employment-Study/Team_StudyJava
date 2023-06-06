package createClass;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Katarina katarina = new Katarina("카타리나", 2508, 112.4, 107.9);
		Malphite malphite = new Malphite("말파이트", 2412, 130, 121.15);

		Random ran = new Random();

		while (true) {
			if (katarina.getHP() <= 0) { // 카타리나 hp가 0이면
				System.out.printf("%s가 %s를 처치했습니다.", malphite.getName(), katarina.getName());
				// 말파이트가 카타리나를 처치했다
				break;
			}
			if (malphite.getHP() <= 0) {	// 말파이트 hp가 0이면
				System.out.printf("%s가 %s를 처치했습니다.", katarina.getName(), malphite.getName());
				// 카타리나가 말파이트를 처치했다
				break;
			}

			int num = ran.nextInt(100);	// 100까지의 정수를 랜덤으로 받아와
			if (num <= 10) {	// 카타리나가 숫자가 나오는 확률만큼의 각 공격을 상대에게 시행
				katarina.E(malphite);
			} else if (num <= 30) {
				katarina.W(malphite);
			} else if (num <= 70) {
				katarina.Q(malphite);
			} else {
				katarina.Attack(malphite);
			}
			// 남은 hp 출력
			System.out.printf("말파 : %.2f vs %.2f : 카타\n\n", malphite.getHP(), katarina.getHP());
			
			num = ran.nextInt(100);
			if (num <= 10) {	// 말파이트가 숫자가 나오는 확률만큼의 각 공격을 상대에게 시행
				malphite.E(katarina);
			} else if (num <= 30) {
				malphite.W(katarina);
			} else if (num <= 70) {
				malphite.Q(katarina);
			} else {
				malphite.Attack(katarina);
			}
			System.out.printf("말파 : %.2f vs %.2f : 카타\n\n", malphite.getHP(), katarina.getHP());

		}
	}
}
