package templarsWeapon;
// 기사단원의 무기
class Solution {
	public int solution(int number, int limit, int power) {
		int answer = 0;
		int[] weapons = new int[number];
		
		for(int i=0;i<weapons.length;i++) {
			weapons[i] = measureOfNumber(i+1);
			System.out.println(weapons[i]);
		}
		
		for(int i=0;i<weapons.length;i++) {
			if(weapons[i] > limit) {
				weapons[i] = power;
			}
			answer += weapons[i];
		}
		
		System.out.println(answer);
		return answer;
	}
	
	public int measureOfNumber(int number) {
		int count = 0;
		for(int i=1;i*i<=number;i++) {
			
			if(i*i == number) {
				count++;
			}
			else if(number%i==0) {
				count+=2;
			}
		}
		return count;
	}
}

public class Main {
	public static void main(String[] args) {
		int number = 5;
		int limit = 3;
		int power = 2;
		
		Solution s = new Solution();
		s.solution(number, limit, power);
	}
}
