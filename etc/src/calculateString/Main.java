package calculateString;
// 문자열 계산하기
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] elements = my_string.split(" ");
        answer += Integer.parseInt(elements[0]);	// 연산자가 없는 첫 숫자 가지기
        
        for(int i = 1 ; i < elements.length ; i++){
            if(i%2!=0) {
            	if(elements[i].equals("+")) {
            		answer += Integer.parseInt(elements[i+1]);
            	}else {
            		answer -= Integer.parseInt(elements[i+1]);
            	}
            }
        }
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		String my_string = "3 + 5";
		Solution s = new Solution();
		
		System.out.println(s.solution(my_string));
	}
}

