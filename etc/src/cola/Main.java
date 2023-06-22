package cola;

class Solution {
	public int solution(int a, int b, int n) {
		int answer = 0;
		int remain = 0;
		
		
		while(n >=  a) {
			if(n%a == 0) {
				n = (n/a)*b;
				answer += n;	
			}else {
				remain = n%a;
				n = (n/a)*b;
				answer += n;
				n += remain;
			}
			System.out.println(answer);
		}
		
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		int a = 3;
		int b = 1;
		int n = 20;
		 Solution s = new Solution();
		 s.solution(a, b, n);
	}
}
