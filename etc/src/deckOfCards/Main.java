package deckOfCards;

// 카드 뭉치
class Solution {
	public String solution(String[] cards1, String[] cards2, String[] goal) {
		String answer = "Yes";
		int c1 = 0;
		int c2 = 0;

		for (String s : goal) {
			if (c1 < cards1.length && s.equals(cards1[c1])) {
				c1++;
			} else if (c2 < cards2.length && s.equals(cards2[c2])) {
				c2++;
			} else {
				answer = "No";
				break;
			}
		}
		return answer;
	}
}

// 카드 뭉치
public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		String[] cards1 = { "i", "drink", "water" };
		String[] cards2 = { "want", "to" };
		String[] goal = { "i", "want", "to",  "drink" ,"water"};

		System.out.println(s.solution(cards1, cards2, goal));
	}
}
