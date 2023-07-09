package babbling2;
// 옹알이2
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] words = {"aya","ye","woo","ma"};
        for(String s : babbling) {
        	StringBuilder sb = new StringBuilder();
        	for(String w : words) {
        		if(s.contains(w+w)) {
        			continue;
        		}
        		s=s.replace(w, "x");
        	}
        	for(int i=0;i<s.length();i++) {
        		sb.append("x");
        	}
        	if(s.equals(sb.toString())) {
        		answer++;
        	}
        }
        System.out.println("answer: "+answer);
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		String[] babbling = {"aya", "yee", "u", "maa"};
		
		s.solution(babbling);
	}
}
