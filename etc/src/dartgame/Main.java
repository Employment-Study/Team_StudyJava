package dartgame;

import java.util.Stack;

//  [1차]다트 게임
class Solution {
	public int solution(String dartResult) {
		int answer = 0;
		Stack<Integer> scoreStack = new Stack<>();
		
		for(int i=1;i<dartResult.length();i++) {
			int result = 0;
			
			if(dartResult.charAt(i)=='S') {
				if(i>=2 && dartResult.charAt(i-1)=='0' && dartResult.charAt(i-2)=='1') {
					result = 10;
				}else {
					result = (int)(dartResult.charAt(i-1)-48);
				}
				scoreStack.push(result);
				
			}
			else if(dartResult.charAt(i)=='D') {
				if(dartResult.charAt(i-1)=='0' && dartResult.charAt(i-2)=='1') {
					result = (int)Math.pow(10,2.0);
				}else {
					result = (int)Math.pow(dartResult.charAt(i-1)-48,2.0);
				}
				scoreStack.push(result);
			}
			else if(dartResult.charAt(i)=='T') {
				if(dartResult.charAt(i-1)=='0' && dartResult.charAt(i-2)=='1') {
					result = (int)Math.pow(10,3.0);
				}else {
					result = (int)Math.pow(dartResult.charAt(i-1)-48,3.0);
				}
				scoreStack.push(result);
			}
			else if(dartResult.charAt(i)=='*') {
				if(!scoreStack.isEmpty()) {
					int n1 = scoreStack.pop();
					
					if(!scoreStack.isEmpty()) {
						int n2 = scoreStack.pop();
						scoreStack.push(n2*2);
					}
					scoreStack.push(n1*2);
				}
			}else if(dartResult.charAt(i)=='#') {
				int n3 = scoreStack.pop();
				scoreStack.push(n3*(-1));
			}
		}	
		for(int i:scoreStack) {
			answer += i;
		}
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		String dartResult = "1D2S3T*";
		int answer = s.solution(dartResult);
		System.out.println(answer);
	}
}
