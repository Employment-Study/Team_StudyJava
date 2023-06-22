package foodFighter;

// 푸드 파이트 대회
class Solution {
    public String solution(int[] food) {
        String answer = "";
        int n  = food[0];
        
        while(n !=  0) {
        	for(int i=1;i<food.length;i++) {
            	for(int j=0;j<(food[i])/(n+1);j++) {
            		answer += i;
            	}
            }
        	answer += 0;
        	if(n%2 == 0) {
        		break;
        	}else {
        		for(int i=food.length-1;i>=0;i--) {
                	for(int j=0;j<(food[i])/(n+1);j++) {
                		answer += i;
                	}
                }
        	}
        	n--;
        }
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();	
		int[] food = {1, 7, 1, 2};
		s.solution(food);
	}
}
