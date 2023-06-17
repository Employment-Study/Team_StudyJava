package budget;
import java.util.Arrays;

//예산
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int i=answer;i<d.length;i++) {
        	if(budget >= d[i]) budget -= d[i];
        	else break;
        	answer++;
        }
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		int [] d = { 2, 2, 3, 3 };
		
		int answer = s.solution(d, 10);
		
		System.out.println("answer : "+answer);
	}
}
