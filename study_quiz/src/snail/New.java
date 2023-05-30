package snail;

public class New {
	static void show(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int size = 5;
		int num = 1;
		int[][] arr = new int[size][size];

		// 다음 형태로 출력하세요
		// 1 2 3 4 5
		// 16 17 18 19 6
		// 15 24 25 20 7
		// 14 23 22 21 8
		// 13 12 11 10 9
		
		int print = 5;
		int k = 1;
		int right = -1;
		int bottom = 0;
		int top = 1;
		
		for(int i = 5; i > 0; i--) {
			for(int j = 0; j < print; j++) {
				right += top;
				arr[bottom][right] = k;
				k++;
			}
			
			print--;
			
			for(int j = 0; j < print; j++) {
				bottom += top;
				arr[bottom][right] = k;
				k++;
			}
			
			top = top * (-1);
		}
		
		show(arr);
	}
}
