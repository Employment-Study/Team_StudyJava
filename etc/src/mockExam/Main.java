package mockExam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// 모의고사
class Solution {
	public int[] solution(int[] answers) {
		int[] answer = {};
		int count = 0;
		int best = Integer.MIN_VALUE;
		int size = 1;
		List<Integer[]> arrList = new ArrayList<Integer[]>();
		
		Integer [] a1 = {1,2,3,4,5};						// answers l = 5 [0 1 2 3 4] 
		Integer [] a2 = {2,1,2,3,2,4,2,5};			// 0 1 2 3 4 5 6 7 0
		Integer [] a3 = {3,3,1,1,2,2,4,4,5,5};
		
		arrList.add(a1);
		arrList.add(a2);
		arrList.add(a3);
		
		for(Integer[] arr : arrList) {
			for(int j = 0;j<answer.length;j++) {
				if (arr[j % answer.length] == answer[j]) {
					count++;
				}
			}
			
			if(count > best) {
				best = count;
				size = 1;
			}
			else if(count == best) {
				size++;
			}
		}
		
		if(size != 1) {
			answer = new int[size];
			for(int i=0;i<size;i++) {
				answer[i] = best;
			}
		}else {
			answer = new int[1];
			answer[0] = best;
		}
		
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] arr1 = {1,2,3,4,5};		// 정답 배열 5지선다 값은 5까지
		int[] arr2 = {1,3,2,4,2};
		int[] arr3 = {4,3,1,2,3};
		System.out.println();
	}
}
