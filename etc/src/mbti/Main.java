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

// 성격 유형 검사하기
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        String type = "RTCFJMAN";
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<type.length();i++){
            map.put(type.substring(i,i+1),0);
        }
        
        for(int i=0;i<survey.length;i++){
            if(choices[i] < 4){
                map.put(survey[i].substring(0,1),map.get(survey[i].substring(0,1))+(4-choices[i]));
            }else if(choices[i] > 4){
                map.put(survey[i].substring(1,2),map.get(survey[i].substring(1,2))+(choices[i]-4));
            }
        }
        
        for(int i=0;i<type.length();i+=2){
            if(map.get(type.substring(i,i+1)) < map.get(type.substring(i+1,i+2))){
                answer += type.substring(i+1,i+2);
            }else{
                answer += type.substring(i,i+1);
            }
        }
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
