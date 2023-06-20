package threeSeparator;


import java.util.ArrayList;

class Solution {
	public String[] solution(String myStr) {
		String[] answer = {};	
		ArrayList<String> strList = new ArrayList<String>();
		
		answer = myStr.split("a");
		for(int i=0;i<answer.length;i++) {
			String[] answer2 = answer[i].split("b");
			for(int j=0;j<answer2.length;j++) {
				String[] answer3 = answer2[j].split("c");
				for(int k=0; k<answer3.length;k++) {
					if(!answer3[k].isEmpty()) {
						strList.add(answer3[k]);
					}
				}
			}
		}
		
		if(strList.isEmpty()) {
			strList.add("EMPTY");
		}
		
		int listSize = strList.size();
		answer = strList.toArray(new String[listSize]);
	
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		String myStr = "baconlettucetomato";
		String[] answer = s.solution(myStr);
		
	}
}
