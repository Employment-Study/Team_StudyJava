package pick2AndAdd;

import java.util.ArrayList;

// 두 개 뽑아서 더하기
class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> numbersArray = new ArrayList<Integer>();
        
        for(int i=0;i<numbers.length-1;i++) {
        	for(int j=i+1;j<numbers.length;j++) {
        		if(numbersArray.contains(numbers[i] + numbers[j])) {
        			continue;
        		}else {
        			numbersArray.add(numbers[i]+numbers[j]);
        		}
        	}
        }
        
        numbersArray.sort(null);
        
        int [] answer = numbersArray.stream()
        		.mapToInt(Integer::intValue)
        	    	.toArray();

        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] numbers = {5,0,2,7};
		s.solution(numbers);
	}
}
