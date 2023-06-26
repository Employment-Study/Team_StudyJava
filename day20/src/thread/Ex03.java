package thread;

import java.util.ArrayList;
import java.util.Scanner;

class Timer implements Runnable {
	
	@Override
	public void run() {
		for(int i=10;i != -1; i--) {
			System.out.printf("%02d : %02d\n", i / 60, i % 60);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class StringInput implements Runnable{
	private Scanner sc = new Scanner(System.in);
	private ArrayList<String> list = new ArrayList<String>();
	private Thread timer;
	
	public StringInput(Thread timer) {
		this.timer = timer;
		Thread th = new Thread(this);
		th.start();
	}
	
	@Override
	public void run() {
		while(timer.isAlive()) {										// 타이머 스레드가 동작중이라면 반복
																							// 타이머 스레드가 종료되면 더 이상 입력받지 않는다.
			System.out.print("입력 : ");						// 입력 프롬프트
			list.add(sc.nextLine());								// 입력받은 문자열을 리스트에 추가한다.
		}													
		System.out.println("입력 끝, 출력 시작");	// 반복이 끝나면 
		list.forEach(System.out::println);			// 리스트의 각 내용을 출력
		System.out.println();
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Thread th1 = new Thread(new Timer());
		
		th1.start();
		StringInput input = new StringInput(th1);
	}
}
