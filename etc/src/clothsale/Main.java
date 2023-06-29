package clothsale;

class Solution {
	public int solution(int price) {
		int answer = 0;
		int sale = 0;
		if (price >= 100000 && price < 300000) {
			sale = (int) (price * 0.05);
		} else if (price >= 300000 && price < 500000) {
			sale = (int) (price * 0.1);
		} else if (price >= 500000) {
			sale = (int) (price * 0.2);
		}
		answer = price - sale;
		
		System.out.println("answer : "+answer);
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		s.solution(300000);
	}
}
