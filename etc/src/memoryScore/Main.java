package memoryScore;

import java.util.Arrays;
import java.util.HashMap;

// 추억 점수
class Solution {
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] answer = new int[photo.length];
		// name과 yearning의 길이는 같다.
		
		HashMap<String, Integer> memoryMap = new HashMap<String, Integer>();
		
		for(int i=0;i<name.length;i++) {
			memoryMap.put(name[i], yearning[i]);
		}
		
		for(int i=0;i<photo.length;i++) {
			for(int j=0;j<photo[i].length;j++) {
				if(memoryMap.containsKey(photo[i][j])) {
					answer[i] += memoryMap.get(photo[i][j]);
				}else {
					continue;
				}
			}
		}
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		String[] name = {"may", "kein", "kain", "radi"};
		int [] yearning = {5, 10, 1, 3};
		String [][] photo = {
				{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}
		};
		int [] solution = s.solution(name, yearning, photo);
		System.out.println(Arrays.toString(solution));	
	}
}
