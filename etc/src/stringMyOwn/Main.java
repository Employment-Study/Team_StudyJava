package stringMyOwn;

import java.util.Arrays;
import java.util.Comparator;

//  문자열 내 마음대로 정렬하기
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        
        Arrays.sort(strings,new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (o1.charAt(n) > o2.charAt(n)) {
                    return 1;
                } else if (o1.charAt(n) < o2.charAt(n)) {
                    return -1;
                } else if (o1.charAt(n) == o2.charAt(n)) {
                    return o1.compareTo(o2);
                }
                return 0;
			}
		});

        answer = strings;
        return answer;
    }
}


public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		String[] strings = {"abce", "abcd", "cdx"};
		int n = 2;
		
		System.out.println(Arrays.toString(s.solution(strings, n)));
	}
}
