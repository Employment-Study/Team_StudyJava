package smallSubstring;

// 크기가 작은 부분 문자열
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int length = p.length();
        
        int num = 0;
        while(num+length<=t.length()) {
        	long sub = Long.parseLong(t.substring(num, num+length));
        	if(sub <= Long.parseLong(p)){
        		answer += 1;
        	}
        	num++;
        }
        return answer;
    }
}
public class Main {
	public static void main(String[] args) {
		String t = "500220839878";
		String p = "7";
		Solution s = new Solution();
		int answer = s.solution(t, p);
		System.out.println("answer : "+answer);
		
	}
}
