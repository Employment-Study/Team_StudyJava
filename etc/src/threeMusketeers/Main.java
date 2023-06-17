package threeMusketeers;
// 삼총사
class Solution {
    public int solution(int[] number) {
        int answer = 0;
        for(int i=0;i<number.length-2;i++) {
        	for(int j=i+1;j<number.length-1;j++) {
        		for(int k=j+1;k<number.length;k++) {
        			if(number[i]+number[j]+number[k] == 0) {
        				answer += 1;
        			}
        		}
        	}
        }    
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] number1 = {-2,3,0,2,-5};
		int[] number2 = {-3,-2,-1,0,1,2,3};
		int[] number3 = {-1,1,-1,1};
		
		int a = s.solution(number1);
		int b = s.solution(number2);
		int c = s.solution(number3);
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
		
	}
}
