package pushKeypad;

import java.util.Stack;

class Solution {
	public String solution(int[] numbers, String hand) {
		String answer = "";
		Integer[][] locations = { { 3, 1 }, { 0, 0 }, { 0, 1 }, { 0, 2 }, { 1, 0 }, { 1, 1 }, { 1, 2 }, { 2, 0 }, { 2, 1 },
				{ 2, 2 }, { 3, 0 }, { 3, 2 } };
		StringBuilder sb = new StringBuilder();
		Stack<Integer[]> l_location = new Stack<Integer[]>();
		Stack<Integer[]> r_location = new Stack<Integer[]>();
		
		l_location.push(locations[10]);
		r_location.push(locations[11]);
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]%3==1) {
				l_location.push(locations[numbers[i]]);
				sb.append("L");
			}else if(numbers[i]%3==0 && numbers[i]!=0) {
				r_location.push(locations[numbers[i]]);
				sb.append("R");
			}else {
				int r = Math.abs(locations[numbers[i]][0]-r_location.peek()[0])+
						Math.abs(locations[numbers[i]][1]-r_location.peek()[1]);
				int l = Math.abs(locations[numbers[i]][0]-l_location.peek()[0])+
						Math.abs(locations[numbers[i]][1]-l_location.peek()[1]);
				if(r < l) {
					r_location.push(locations[numbers[i]]);
					sb.append("R");
				}else if(l < r) {
					l_location.push(locations[numbers[i]]);
					sb.append("L");
				}else {
					System.out.println(l);
					System.out.println(r);					
					if(hand=="left") {
						System.out.println(numbers[i]);
						l_location.push(locations[numbers[i]]);
						sb.append("L");
					}else{
						System.out.println(numbers[i]);
						r_location.push(locations[numbers[i]]);
						sb.append("R");
					}
				}
			}
		}
		
		answer = sb.toString();
		return answer;

	}
}

public class Main {
	public static void main(String[] args) {
		int[] numbers = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
		String hand = "right"; // 오른손잡이

		Solution s = new Solution();
		System.out.println(s.solution(numbers, hand));
	}
}

/*
 * numbers hand result
 * ----------------------------------------------------------
 *  [1, 3, 4, 5, 8, 2,1, 4, 5, 9, 5] "right" "LRLLLRLLRRL"
 *  [7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2] "left""LRLLRRLLLRR" 
 *  [1, 2, 3, 4, 5, 6, 7, 8, 9, 0] "right" "LLRLLRLLRL"
 */
