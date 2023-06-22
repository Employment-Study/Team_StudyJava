package proximateString;

import java.util.Arrays;
import java.util.HashMap;

// 가장 가까운 글자
class Solution {
    public int[] solution(String s) {
    	
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> indexMap = new HashMap<Character, Integer>();
        
        for(int i=0;i<s.length();i++) {
        	if(indexMap.containsKey(s.charAt(i))) {
        		answer[i] = i - (indexMap.get(s.charAt(i)));
        		indexMap.put(s.charAt(i), i);
        	}else {
        		indexMap.put(s.charAt(i),i);
        		answer[i] = -1;
        	}
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		String s = "banana";
		Solution sol = new Solution();
		sol.solution(s);
	}
}
