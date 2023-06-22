package stringOfNumbersAndWords;

import java.util.HashMap;
import java.util.Map;

// 숫자와 단어의 문자열
class Solution {
	public int solution(String s) {
		int answer = 0;
		HashMap<String, String> numMap = new HashMap<String, String>();
		numMap.put("zero", "0");
		numMap.put("one", "1");
		numMap.put("two", "2");
		numMap.put("three", "3");
		numMap.put("four", "4");
		numMap.put("five", "5");
		numMap.put("six", "6");
		numMap.put("seven", "7");
		numMap.put("eight", "8");
		numMap.put("nine", "9");
		
		for( Map.Entry<String, String> elem : numMap.entrySet() ){
            s = s.replaceAll(elem.getKey(), elem.getValue());
        }
		answer = Integer.parseInt(s);
		
		System.out.println(answer);
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String s = "one4seveneight";
		sol.solution(s);
	}
}
