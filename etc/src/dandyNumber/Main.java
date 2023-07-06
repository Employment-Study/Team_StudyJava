package dandyNumber;
// 멋쟁이 숫자
class Solution{
	public int solution(String s) {
		int answer = -1;
		for(int i=0;i<s.length()-2;i++) {
			if(s.charAt(i)==s.charAt(i+1) && s.charAt(i+1)==s.charAt(i+2)) {
				answer = Math.max(answer, Integer.parseInt(s.substring(i,i+3)));
			}
		}
		return answer;
	}
}
public class Main {
	public static void main(String[] args) {
		Solution solution = new Solution();
		String s = "111999333";
		int answer = solution.solution(s);
		System.out.println("answer : " + answer);
	}
}
