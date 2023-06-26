package thread;

import java.util.Scanner;

class Timer2  implements Runnable{ 
	private boolean over;
	private int time;					
	private Thread th;				
	// 생성자
	public Timer2() {
		over = false;									// 처음에는 문제가 안 끝난 상태
		time = 60;										// 남은시간을  60초로 설정했습니다.
		th = new Thread(this);				// Timer2 Thread 생성
		th.start();										// 스레드 실행
	}
	
	@Override
	public void run() {
		for(getTime(); getTime() != -1;setTime(getTime()-1)) {
			if(getTime()%10 == 0) 
				System.err.printf(" \n[남은시간] %02d분 : %02d초 \n",getTime()/ 60, getTime()% 60);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(isOver()) {
				break;
			}	
		}
		// 시간초과의 경우
		if(getTime() == -1) {
			System.out.println("시간 초과 !!!!!!");
		}
		over = true;
	}

	
	public Thread getTh() {
		return th;
	}

	public void setTh(Thread th) {
		this.th = th;
	}

	public boolean isOver() {
		return over;
	}

	public void setOver(boolean over) {
		this.over = over;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
}

class Question implements Runnable{
	private Timer2 timer;								// 문제 풀이에 사용할 타이머
	private Scanner sc;									// 입력을 받기 위한 Scanner(Main에서 받음)
	
	public Question(Scanner sc) {
		this.sc = sc;
		this.timer = new Timer2();		// 생성과 동시에 타이머 실행
		Thread th = new Thread(this);
		th.start();
	}
	@Override
	public void run() {	// 전체 Question 흐름
		int answer = 0;
		System.out.println("다음 문제를 푸시오. (제한시간 60초) ");
		while(answer != 4) {
			System.out.println("문제 ) 다음 중 출연 작품이 서로 다른 하나는?");
			System.out.println("1. 짱구");
			System.out.println("2. 유리");
			System.out.println("3. 철수");
			System.out.println("4. 코난");
			System.out.println("5. 훈이");
			System.out.print("입력 >> ");
			answer = Integer.parseInt(sc.nextLine());
			if(timer.getTime() <= 0) {
				timer.setOver(true);
				break;
			}
		}
		if(timer.isOver()==false)
			System.out.printf("정답입니다. %d초를 남기고 정답을 풀었습니다!! \n",timer.getTime());
		else {
			System.out.println("너무 늦게 입력하셨습니다... 타임아웃!!");
		}
		timer.setOver(true);
		sc.close();
	}
	public Timer2 getTimer() {
		return timer;
	}
	public void setTimer(Timer2 timer) {
		this.timer = timer;
	}
	
}

public class Ex04 {
	public static void main(String[] args) {
		// 타이머가 시작된 후 문제를 낸다.
		// 문제는 객관식으로 1번에서 5번까지의 선택지가 있다.
		// 답을 입력하면 정답 오답을 판별하여 출력해야한다.
		// 정답 / 오답 여부에 상관없이 타이머가 종료되었다면 오답으로 판정한다.
		// 이미 입력이 끝났다면 더 이상 타이머를 진행하지 않아야 한다.
		Scanner sc = new Scanner(System.in);
		Question q = new Question(sc);
		
	}
}
