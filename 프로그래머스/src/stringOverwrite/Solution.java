package stringOverwrite;

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
    	/*
    	 * 문자열 my_string, overwrite_strinig과 정수 s가 주어집니다
    	 * 문자열 my_strinig의 인덱스 s부터 overwrite_string의 길이만큼을 문자열 overwrite_string으로 바꾼 문자열을 return하는 solution 함수를 작성해주세요
    	 * 
    	 * 입출력 예
    	 * my_string : He11oWor1d, overwrite_string : lloWorl, s : 2, result : HelloWorld
    	 * my_string : Program29b8UYP, overwrite_string : merS123, s : 7, ProgrammersS123
    	 */
        String answer = my_string;
        int lastindex = overwrite_string.length();
        
        for(int i = 0; i < my_string; i++) {
        	
        }
        
        for(int i = s; i <= lastindex; i++) {
        	answer[i].replace
        }
        return answer;
    }
}