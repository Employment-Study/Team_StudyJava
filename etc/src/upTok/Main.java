package upTok;

import java.util.Arrays;
// k번째 수
class Solution {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int count = 0;
		int[] arr = null;

		for (int i = 0; i < commands.length; i++) {
			arr = new int[commands[i][1] - commands[i][0] + 1];
			for (int k = 0; k < arr.length; k++) {
				arr[k] = array[commands[i][0] - 1 + k];
			}
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
			answer[count] = arr[commands[i][2]-1];
			
			count++;
		}
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

		Solution s = new Solution();
		s.solution(array, commands);
	}
}
