package partnerNumber;

import java.util.ArrayList;
import java.util.HashMap;

// 숫자 짝꿍
class Solution {
    public String solution(String X, String Y) {
        String answer = "-1";
       
        HashMap<Character, Integer> xMap = new HashMap();
        for(int i=0;i<X.length();i++) {
        	if(!xMap.containsKey(X.charAt(i))) {
        		xMap.put(X.charAt(i), 1);
        	}
        	else {
        		xMap.put(X.charAt(i), xMap.get(X.charAt(i))+1);
        	}
        }
        
        ArrayList<Integer> resultList = new ArrayList(); 
        for(int i=0;i<Y.length();i++) {
        	if(xMap.containsKey(Y.charAt(i))) {
        		resultList.add(Y.charAt(i)-48);
        		xMap.put(Y.charAt(i), xMap.get(Y.charAt(i))-1);
        		if(xMap.get(Y.charAt(i)) == 0) {
        			xMap.remove(Y.charAt(i));
        		}
        	}
        }
        
        if(!resultList.isEmpty()) {
        	long tmp = 0L;
            resultList.sort(null);
            for(int i=resultList.size()-1;i>=0;i--) {
            	tmp += (long)(Math.pow(10, i)) * resultList.get(i);
            }
            answer = tmp+"";
        }
        
        System.out.println(answer);
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		
		s.solution("100", "203045");
	}
}
