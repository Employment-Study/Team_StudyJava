package array;

import java.util.Random;
import java.util.Arrays;

public class Quiz3 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		int size = 10;
		int range = 100;
		int[] arr = new int[size];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(range);
		}
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		// 1) arr의 값에서 홀수와 짝수가 각각 몇개인지 파악하여 출력하세요
		int oddCount = 0, evenCount = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		System.out.printf("1) 홀수의 개수 : %d, 짝수의 개수 : %d\n", oddCount, evenCount);
		
		// 2) oddArray와 evenArray를 생성하여 각각 홀수와 짝수를 담아서 출력하세요
		int[] oddArray = new int[oddCount];
		int[] evenArray = new int[evenCount];
		
		int oddIndex = 0, evenIndex = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
//				evenArray[evenArray.length - evenCount] = arr[i];
//				evenCount--;
				evenArray[evenIndex++] = arr[i];
			}
			else {
//				oddArray[oddArray.length - oddCount] = arr[i];
//				oddCount--;
				oddArray[oddIndex++] = arr[i];
			}
		}
		System.out.println(Arrays.toString(oddArray));
		System.out.println(Arrays.toString(evenArray));
		
		// 3) arr의 총합을 구하여 출력하세요
		int sum = 0;
		for(int num : arr) {
			sum += num;
		}
		System.out.println("합계 : " + sum);
		
		
		
		
		
	}
}
