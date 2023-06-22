package hallOfFrame;

import java.util.ArrayList;
import java.util.Arrays;
// 명예의 전당1
class Solution {
	public int[] solution(int k, int[] score) {
		int[] answer = new int[score.length];
		ArrayList<Integer> frameList = new ArrayList<Integer>();
		int index = 0;
		while (frameList.size() <= k && index < score.length) {
			
			if (!frameList.isEmpty() && frameList.get(0) > score[index]) {
				
				answer[index] = frameList.get(0);
				index++;
				continue;
			} else {	
				frameList.add(score[index]);
			}
			System.out.println("frameList : "+frameList);
			frameList.sort(null);
			if (frameList.size() == k) {
				answer[index] = frameList.get(0);
			}else {
				answer[index] = frameList.get(0);
			}
			index++;
		} // end of while
		System.out.println(Arrays.toString(answer));
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		int k = 3;
		int[] score = { 10, 100, 20, 150, 1, 100, 200 };
		Solution s = new Solution();
		s.solution(k, score);
	}
}
