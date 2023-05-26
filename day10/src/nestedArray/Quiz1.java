package nestedArray;

public class Quiz1 {

	static void step(int step) {
		switch (step) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		default:
			break;
		}
	}

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

		int[][] arr = new int[size][size];

		// 다음 형태로 출력하세요
		// 1 2 3 4 5
		// 16 17 18 19 6
		// 15 24 25 20 7
		// 14 23 22 21 8
		// 13 12 11 10 9

		int num = 1;
		int sign = 5;
		int count = 0;
		while (size != 0) {
			sign = size - sign;
			if (size == 5) {
				for (int j = 0; j < size; j++) {
					arr[sign][j] = num++;
					if (count == size && arr[sign + 1][j] == 0) {
						break;
					}
				}
			}

			else if (size % 2 == 1 && size != 5) {

			} else if (size % 2 == 0) {
				
			}
			size--;
		} // end of while
	} // end of main
}// end of class
