package createArray4;

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] arr = { 1, 1, 4, 4, 3 };
		int[] result = s.solution(arr);

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
