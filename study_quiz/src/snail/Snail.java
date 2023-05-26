package snail;

public class Snail {
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

//		while (size != 0) {
//			for(int i = 0; i < size; i++) {
//				for(int j = 0; j < size; j++) {
//					arr[i][j] = num++;
//				}
//				size--;
//			}			
//		}
//		show(arr);
		int x = 0, y = 0;
		for (int j = y; j < size; j++) {
			arr[x][j] = num++;
			y = j;
		}
		show(arr);

		for (int i = x + 1; i < size; i++) {
			arr[i][y] = num++;
			x = i;
		}
		show(arr);
		size -= 1;
		System.out.printf("%d, %d\n", x, y);
		System.out.println("size : " + size);

		System.out.println();

		for (int j = y; j >= 0; j--) {
			arr[x][j] = num++;
			y = j;
		}
		show(arr);
		for (int i = x - 1; i >= y + 1; i--) {
			arr[i][y] = num++;
			x = i;
		}
		show(arr);
		size -= 1;
		System.out.printf("%d, %d\n", x, y);
		System.out.println("size : " + size);
		
		System.out.println();

		for (int j = x; j <= size; j++) {
			arr[x][j] = num++;
			y = j;
		}
		
		show(arr);
		
		for (int i = x+1; i<=size;i++) {
			arr[i][y] = num++;
			x = i;
		}
		size -= 1;
		System.out.printf("%d, %d\n", x, y);
		System.out.println("size : " + size);
		show(arr);
		
		for (int j = y-1;j >= size -1; j--) {
			arr[x][j] = num++;
			y = j;
		}
		System.out.printf("%d, %d\n", x, y);
		show(arr);
		
		for (int i = x -1; i >= size; i--) {
			arr[i][y] = num++;
			x = i;
		}
		size -= 1;
		System.out.println("size : " + size);
		System.out.printf("%d, %d\n", x, y);
		show(arr);
		
		for (int j = y + 1; j <= size + 1; j++) {
			arr[x][j] = num++;
			y = j;
		}
		size -= 1;
		System.out.println("size : " + size);
		System.out.printf("%d, %d\n", x, y);
		show(arr);
		
		

//		num = 1;
//		arr = new int[5][5];
//
//		arr[0][0] = 1;
//		arr[0][1] = 2;
//		arr[0][2] = 3;
//		arr[0][3] = 4;
//		arr[0][4] = 5;
//		arr[1][4] = 6;
//		arr[2][4] = 7;
//		arr[3][4] = 8;
//		arr[4][4] = 9;
//		arr[4][3] = 10;
//		arr[4][2] = 11;
//		arr[4][1] = 12;
//		arr[4][0] = 13;
//		arr[3][0] = 14;
//		arr[2][0] = 15;
//		arr[1][0] = 16;
//		arr[1][1] = 17;
//		arr[1][2] = 18;
//		arr[1][3] = 19;
//
//		show(arr);
	}
}
