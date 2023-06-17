package orderCoffee;
// 커피 심부름
class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(String coffee : order) {
        	if(coffee.contains("americano") || coffee.contains("anything")) {
        		answer += 4500;
        	}else if(coffee.contains("cafelatte")) {
        		answer += 5000;
        	}
        }
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		String[] orders = {"cafelatte", "americanoice", "hotcafelatte", "anything"};
		Solution s = new Solution();
		
		System.out.println(s.solution(orders));
	}
}
