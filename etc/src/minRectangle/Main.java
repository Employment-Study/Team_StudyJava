package minRectangle;
// 최소 직사각형(지갑 명함)
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxWidth = Integer.MIN_VALUE;
        int maxHeight = Integer.MIN_VALUE;
      
        for(int i=0;i<sizes.length;i++) {
        	int w = Math.max(sizes[i][0], sizes[i][1]);
        	int h = Math.min(sizes[i][0], sizes[i][1]);
        	maxWidth = Math.max(maxWidth, w); 
        	maxHeight = Math.max(maxHeight, h);
        }
        answer = maxHeight * maxWidth;
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		int[][] sizes = {
				{60,50},
				{30,70},
				{60,30},
				{80,40}
		};
		Solution s=  new Solution();
		s.solution(sizes);
	}
}
