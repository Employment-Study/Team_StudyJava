package gymsuit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// 체육복
class Solution {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=1;i<=n;i++) {
			map.put(i, 1);
		}
		
		for(int i=0;i<lost.length;i++) {
			map.put(lost[i],map.get(lost[i])-1);
		}
		
		for(int i=0;i<reserve.length;i++) {
			map.put(reserve[i],map.get(reserve[i])+1);
		}
		System.out.println(map);
		Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator();
		while (entries.hasNext()) {
			Map.Entry<Integer, Integer> entry = entries.next();
			if(entry.getValue()==0) {
				if(entry.getKey()-1 > 0 && map.get(entry.getKey()-1) > 1) {
					map.put(entry.getKey()-1, map.get(entry.getKey()-1)-1);
					map.put(entry.getKey(), 1);
					answer++;
				}
				else if(entry.getKey() < n && map.get(entry.getKey()+1)>1) {
					map.put(entry.getKey()+1, map.get(entry.getKey()+1)-1);
					map.put(entry.getKey(), 1);
					answer++;
				}else {
					
				}
			}else {
				answer++;
			}
		}

		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		int n = 5;
		int[] lost = {2,4};	// 2 3 4	1 2 3 4 5
		int[] reserve = {1,3};			

		Solution s = new Solution();
		s.solution(n, lost, reserve);
	}
}
