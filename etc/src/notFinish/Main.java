package notFinish;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> finishMap = new HashMap<String, Integer>();
        for(String s : participant) {
        	if(finishMap.containsKey(s)) {
        		finishMap.put(s, finishMap.get(s)+1);
        	}else {
        		finishMap.put(s, 1);
        	}
        }
        
        for(String s : completion) {
        	finishMap.put(s, finishMap.get(s)-1);
        }
        
        Iterator<Map.Entry<String, Integer>> entries = finishMap.entrySet().iterator();
        while(entries.hasNext()) {
        	Map.Entry<String, Integer> entry = entries.next();
        	if(entry.getValue()!=0) {
        		answer = entry.getKey();
        	}
        }
        
        System.out.println(answer);
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		Solution s = new Solution();
		s.solution(participant, completion);
	}
}
