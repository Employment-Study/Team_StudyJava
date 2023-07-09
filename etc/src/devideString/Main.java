package devideString;


// 문자열 나누기
class Solution {
	public int solution(String s) {
		char first = s.charAt(0);	// 첫 글자
		int firstNum = 0;			// 기준 문자 갯수
		int diff = 0;				// 기준 문자가 아닌 문자들의 갯수
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			if (firstNum == diff) {
				result++;
				first = s.charAt(i);
				
			}
			if (s.charAt(i) == first) firstNum++;
			else diff++;
			
		}
		return result;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String s = "aaabbaccccabba";
		
		sol.solution(s);
	}
}
