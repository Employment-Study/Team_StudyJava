package secretMap;

// 비밀지도

class Solution {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[arr1.length];
		String[] s_arr1 = new String[arr1.length];
		String[] s_arr2 = new String[arr2.length];
		
		for(int i=0;i<arr1.length;i++) {
			String test = "";
			int num = (int)Math.pow(2, n-1);
			while(num > 0) {
				if(arr1[i] / num == 1) {
					test+="#";
				}else {
					test+=" ";
				}
				arr1[i] %= num;
				num /= 2;
			}
			s_arr1[i] = test;
		}
		
		for(int i=0;i<arr2.length;i++) {
			String test = "";
			int num = (int)Math.pow(2, n-1);
			while(num > 0) {
				if(arr2[i] / num == 1) {
					test+="#";
				}else {
					test+=" ";
				}
				arr2[i] %= num;
				num /= 2;
			}
			System.out.println("test2 = ["+test+"]");
			s_arr2[i] = test;
		}

		for(int i=0;i<n;i++) {
			answer[i] = "";
			for(int j=0;j<n;j++) {
				if (s_arr1[i].charAt(j) != s_arr2[i].charAt(j)) {
					answer[i] += "#";
				}else if(s_arr1[i].charAt(j) == '#' && s_arr2[i].charAt(j) == '#'){
					answer[i] += "#";
				}else {
					answer[i] += " ";
				}
			}
		}
		return answer;
	}
}

// #  # 
public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		int n = 5;
		int[] arr1 = {9,20,28,18,11};
		int[] arr2 = {30,1,21,17,28};
		
		s.solution(n, arr1, arr2);
	}
}
