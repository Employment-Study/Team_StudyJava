package partnerNumber;
// 숫자 짝꿍
class Solution {
	public String solution(String X, String Y) {
		String answer = "-1";
		String[] sx = X.split("");
		String[] sy = Y.split("");
		StringBuilder sb = new StringBuilder();
		
		int[] arrResult = new int[10];
		int[] xarr = new int[10];
		int[] yarr = new int[10];
		int result = 0;
		
		for(int i=0;i<sx.length;i++) {
			xarr[Integer.parseInt(sx[i])]++;
		}
		
		for(int i=0;i<sy.length;i++) {
			yarr[Integer.parseInt(sy[i])]++;
		}
		
		for(int i=9;i>=0;i--) {
			while(xarr[i]>0 && yarr[i] > 0) {
				sb.append(i);
				
				xarr[i]--;
				yarr[i]--;
			}
		}
		
		answer = sb.toString();
	
		if(answer.equals("")) answer = "-1";
		if(answer.charAt(0)=='0') answer = "0";
		
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		s.solution("5525", "1255");
	}
}
