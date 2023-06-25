package countingChar;

import java.util.Arrays;
import java.util.HashMap;
// 문자 갯수 세기
class Solution {
	public int[] solution(String my_string) {
		int[] answer = new int[52];	// 총 알파벳 갯수 26 x 2
		HashMap<Character, Integer> stringMap = new HashMap<Character, Integer>();
		
		for(int i='A';i<='z';i++) {
			if(i < 91 || i > 96)
				stringMap.put((char) i,0);
		}
		
		for(int i=0;i<my_string.length();i++) {
			if(stringMap.containsKey(my_string.charAt(i))) {
				stringMap.put(my_string.charAt(i),stringMap.get(my_string.charAt(i))+1);
			}
		}

		for(int i=0;i<answer.length/2;i++) {
			answer[i] = stringMap.get((char) (65+i));
		}
		
		for(int i=answer.length/2;i<answer.length;i++) {
			answer[i] = stringMap.get((char) (71+i));
		}
		
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		String my_string = "Programmers";
		Solution s = new Solution();
		System.out.println(Arrays.toString(s.solution(my_string)));
	}
}
