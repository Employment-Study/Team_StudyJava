package failureRate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class Solution {
	public int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		int stage = 1;
		int mans = stages.length;
		HashMap<Integer, Double> resultMap = new HashMap<Integer, Double>();
		
		for (int i = 1; i < N + 1; i++) {
			int count = 0;
			for (int j = 0; j < stages.length; j++) { // N+1이 있으면 모든 스테이지 깬거임
				if(stages[j] == stage) {
					count++;
				}
			}
			resultMap.put(i,(double)count / mans) ;
			stage++;
			mans -= count;
		}
	
		List<Map.Entry<Integer, Double>> entryList = new LinkedList<>(resultMap.entrySet());
		entryList.sort(new Comparator<Map.Entry<Integer, Double>>() {
			@Override
			public int compare(Entry<Integer, Double> o1, Entry<Integer, Double> o2) {
				if(o2.getValue() > o1.getValue()) {
					return 1;
				}else if(o2.getValue() < o1.getValue()) {
					return -1;
				}else {
					return 0;
				}
			}
			
		});
		int index = 0;
		for(Map.Entry<Integer, Double> entry : entryList) {
			// System.out.println("keys : " + entry.getKey() + ", values : " + entry.getValue());
			answer[index] = entry.getKey();
			index++;
		}
		
		
		System.out.println(Arrays.toString(answer));
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		int N = 5;
		int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 };
		Solution s = new Solution();
		s.solution(N, stages);
	}
}
