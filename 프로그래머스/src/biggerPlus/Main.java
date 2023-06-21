package biggerPlus;

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		int a;
		int b;
		int result;
		
		a = 9;
		b = 91;
		result = s.solution(a, b);
		System.out.println(result);
		
		a = 89;
		b = 8;
		result = s.solution(a, b);
		System.out.println(result);
	}
}
