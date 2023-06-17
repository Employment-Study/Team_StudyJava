package caesarCipher;

// 시저 암호
class Solution {
	public String solution(String s, int n) {
		String answer = "";
		StringBuilder sb = new StringBuilder(s);
		
		for(int i=0;i<sb.length();i++) {
			int p = sb.charAt(i);
			
			if(sb.charAt(i) == ' ')
				continue;
			// 대문자인 경우
			if ((p > 65 && p < 91)) {
				if(p+n >= 91) {
					p = p-26;			// p = 90 n = 25	
				}						// p = 64 n = 25
			}
			
			// 소문자인 경우
			if ((p > 97 && p<123)) {
				if(p+n >= 123) {
					p = p-26;			// p = 122 n = 25	
				}						// p = 98  n = 25
			}
			sb.setCharAt(i, (char)(n+p));
		}
		
		answer = sb.toString();
		
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		String answer = s.solution("abcdefghijklmnopqrstuvwxyz", 25);
//		String answer2 = s.solution("z", 25);
//		String answer3 = s.solution("a B z", 25);
		
		System.out.println(answer);
//		System.out.println(answer2);
//		System.out.println(answer3);

	}
}
