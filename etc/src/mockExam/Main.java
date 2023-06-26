package mockExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// 모의고사
class Solution {
	public int[] solution(int[] answers) {
		int[] answer = new int[3];
		int[] matches = new int[3];
		int[] first = { 1, 2, 3, 4, 5 };
		int[] second = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] third = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int max = Integer.MIN_VALUE;
		int n = answers.length;
		int count = 0;
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == first[i % 5])
				matches[0]++;
			if (answers[i] == second[i % 8])
				matches[1]++;
			if (answers[i] == third[i % 10])
				matches[2]++;
		}
		
		for(int i=0;i<matches.length;i++) {
			
		}

		System.out.println(Arrays.toString(answer));
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] arr1 = { 1, 2, 3, 4, 5 }; // 정답 배열 5지선다 값은 5까지
		int[] arr2 = { 1, 3, 2, 4, 2 };
		int[] arr3 = { 4, 3, 1, 2, 3 };
		s.solution(arr3);
		System.out.println();
	}
}
