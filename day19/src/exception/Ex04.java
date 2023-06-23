package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class ScoreOutOfBoundsException extends Exception {
	// Exception 클래스를 상속받은 새로운 클래스
	// 예외가 가져야할 모든 항목들을 상속 받아서 가지고 있게 됩니다

	private static final long serialVersionUID = 1L;
	private int value;
	public ScoreOutOfBoundsException(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "점수의 범위를 벗어났습니다 -> " + value;
	}
	
	@Override
	public String getMessage() {
		return this.getClass().toGenericString();
	}
	
}


// 예외 내가 만들어서 던지기
public class Ex04 {
	public static void main(String[] args) {
		// 예외 클래스 만들기
		
		Scanner sc = new Scanner(System.in);
		String result="";
		int score = 0;
		try {
			System.out.print("점수 입력 (0 ~ 100) >> ");
			score = sc.nextInt();
			if(score > 100 || score < 0) {
				throw new ScoreOutOfBoundsException(score);
			}
		}catch (InputMismatchException e) {
			System.out.println("잘못된 형식의 값을 입력했습니다." + e);
			score = 0;
		}catch(ScoreOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
			score = 0;
		}finally {
			sc.close();
		}
		result = score >= 60 ? "합격" : "불합격";
		
		System.out.printf("점수 : %d, 결과 : %s\n",score,result);
	}
}
