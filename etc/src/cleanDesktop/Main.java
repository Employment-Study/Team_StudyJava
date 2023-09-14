package cleanDesktop;

import java.util.Arrays;
// 바탕화면 정리
class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int minStartX = 51;
        int minStartY = 51;
        int maxEndX = -1;
        int maxEndY = -1;
        
        for(int i=0;i<wallpaper.length;i++){
            if(wallpaper[i].contains("#")){
                if(i<minStartY){
                    minStartY = i;
                }
                if(wallpaper[i].indexOf("#") < minStartX){
                    minStartX = wallpaper[i].indexOf("#");
                }
                
                for(int j=wallpaper[i].length()-1;j>=0;j--){
                    if(wallpaper[i].charAt(j) == '#'){
                        if(j+1 > maxEndX){
                            maxEndX = j+1;
                        }
                    }
                }
                if(i+1 > maxEndY){
                    maxEndY = i+1;
                }
            }
        }

        answer[0] = minStartY;
        answer[1] = minStartX;
        answer[2] = maxEndY;
        answer[3] = maxEndX;

        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String[] wallpaper = {
				".#...", 
				"..#..",
				"...#.",
		};
		System.out.println(Arrays.toString(sol.solution(wallpaper)));
	}
}
