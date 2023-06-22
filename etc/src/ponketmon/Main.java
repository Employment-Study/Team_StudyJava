package ponketmon;

import java.util.HashSet;
// 폰켓몬
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int div = nums.length / 2; 	// 길이는 항상 짝수이다.	뽑는 수
        HashSet<Integer> entrySet = new HashSet<Integer>();
        for(int i : nums) {
        	entrySet.add(i);
        }
        if(div < entrySet.size()) {
        	answer  = div;
        }else {
        	answer  = entrySet.size();
        }
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		int[] nums = {3,3,3,2,2,4};
		Solution s = new Solution();
		s.solution(nums);
	}
}
