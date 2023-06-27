package deckOfCards;

// 카드 뭉치
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int c1=0;
        int c2=0;
        
        for(int i=0;i<goal.length;i++) {
        	if(c1 < cards1.length && goal[i].equals(cards1[c1])) {
        		c1++;
        	}else if(c2 < cards2.length && goal[i].equals(cards2[c2])){
        		c2++;
        	}
        }
        
        System.out.println(answer);
        return answer;
    }
}

// 카드 뭉치
public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		String[]cards1 = {"i", "drink", "water"};
		String[] cards2 = {"want", "to"};
		String[] goal = {"i", "want", "to", "drink","water"};
		
		s.solution(cards1, cards2, goal);
	}
}
