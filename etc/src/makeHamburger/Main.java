package makeHamburger;

import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<ingredient.length;i++){
            list.add(ingredient[i]);
            
            if(list.size() >= 4){
                if(list.get(list.size()-4)==1 &&
                  list.get(list.size()-3)==2 && 
                  list.get(list.size()-2)==3 &&
                  list.get(list.size()-1) == 1){
                    answer += 1;
                    for(int j=0;j<4;j++){
                        list.remove(list.size()-1);    
                    }
                }
            }
        }
        
        
        return answer;
    }
}


public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] ingredient = {2,1,1,2,3,1,2,3,1};
		int answer = s.solution(ingredient);
		System.out.println("answer : "+answer);
	}
}
