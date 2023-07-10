package roughKeyboard;

import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int step = 0;
        
        HashMap<String, Integer> kmap = new HashMap<String, Integer>();
        for(int i=0;i<keymap.length;i++) {
        	String[] elements = keymap[i].split("");
        	for(int j=0;j<elements.length;j++) {
        		if(kmap.containsKey(elements[j])) {
        			kmap.put(elements[j],Math.min(j+1, kmap.get(elements[j])));
        		}else {
        			kmap.put(elements[j], j+1);
        		}
        	}
        }
        System.out.println(kmap);
        // 검증
        for(int i=0;i<targets.length;i++) {
        	String[] eTargets = targets[i].split("");
        	for(String t : eTargets) {
        		if(kmap.containsKey(t)) {
        			step += kmap.get(t); 
        		}else {
        			step = -1;
        			break;
        		}
        	}
        	answer[i] = step;
        	step = 0;
        }
        
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		// 키보드 키 매핑
		String[] keymap = {"ABCE"};
		String[] targets = {"ABDE"};
		
		Solution s = new Solution();
		s.solution(keymap, targets);
	}
}
