package stringOverwrite;


public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		String my_string;
		String overwrite_string;
		int n;
		String result;
		
		my_string = "He11oWor1d";
		overwrite_string = "lloWorl";
		n = 2;
		result = s.solution(my_string, overwrite_string, n);
		System.out.println(result);
		
		my_string = "Program29b8UYP";
		overwrite_string = "merS123";
		n = 7;
		result = s.solution(my_string, overwrite_string, n);
		System.out.println(result);
	}
}
