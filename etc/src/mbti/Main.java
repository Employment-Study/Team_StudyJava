package mbti;

import java.util.HashMap;
import java.util.Map;

// 성격 유형 검사
/*
 * 지표 번호	성격 유형
1번 지표	라이언형(R), 튜브형(T)
2번 지표	콘형(C), 프로도형(F)
3번 지표	제이지형(J), 무지형(M)
4번 지표	어피치형(A), 네오형(N)
 */
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<String,Integer> surveyMap = new HashMap<String,Integer>();
        for(int i=0;i<survey.length;i++) {
        	surveyMap.put(survey[i], choices[i]);
        }
        Map<Character, Integer> scoreMap = new HashMap<Character, Integer>();
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		String[] survey = {"AN","CF", "MJ", "RT", "NA"};
		int[] choices = {5,3,2,7,5};
		
		System.out.println("answer : "+s.solution(survey, choices));
	}
}
