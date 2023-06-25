package addEmptyArray;

import java.util.Stack;
// 빈 배열에 추가/삭제하기
class Solution {
	
	public int[] solution(int[] arr, boolean[] flag) {
		int[] answer = {};
		Stack<Integer> arrStack = new Stack<Integer>();
		for(int i=0;i<flag.length;i++) {
			if(flag[i]) {
				for(int j =0;j<arr[i]*2;j++) {
					arrStack.push(arr[i]);
				}
			}else {
				for(int j =0;j<arr[i];j++) {
					arrStack.pop();
				}
			}
		}
		
		answer = new int[arrStack.size()];
		
		for(int i=0;i<answer.length;i++) {
			answer[i] = arrStack.pop();
		}
		
		for(int i=0; i<answer.length/2; i++){ 
			int temp = answer[i]; 
			answer[i] = answer[answer.length -i -1]; 
			answer[answer.length -i -1] = temp; 
		}

		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] arr = {3,2,4,1,3};
		boolean[] flag = {true, false, true, false, false};
		s.solution(arr, flag);
	}
}
