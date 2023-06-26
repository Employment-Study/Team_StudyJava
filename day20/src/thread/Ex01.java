package thread;

class JobA extends Thread {
	// 1) Thread 클래스를 상속받는다.
	// 2) public void run() 를 오버라이딩하여 내용을 작성한다.
	// 3) 객체를 생성한 후 start() 메서드를 호출하여 동시작업을 수행한다.
	
	@Override
	public void run() {
		for(char ch = 'A'; ch <= 'Z';ch++) {
			System.out.print(ch + " ");
		}
	}
}

class JobB extends Thread {
	@Override
	public void run() {
		for(int i= 1;i<=25;i++) {
			System.out.print(i+ " ");
		}
	}
}

public class Ex01 {
	public static void main(String[] args) {
		// Thread : 동시에 서로 다른 작업을 수행하기 위한 클래스
		JobA a = new JobA();
		JobB b = new JobB();
		
		 a.run(); //  일반적인 메서드 호출을 진행하여 
		 b.run(); //  다중 스레드로 작동하지 않는다.
		 System.out.println();
		
		// start는 동시에 실행된다.
		// run의 내용을 별도의 스레드로 생성하여 
		// 새로운 스레드 내부에서 실행한다.
		a.start();
		b.start();
		System.out.println();
		
		// CPU라는 덩어리는 하나인데 핵심유닛(코어)는 여러개 
		// CPU의 코어는 Thread라는 단위로 나뉘어서 작업을 처리한다.
		// 다중 작업에 유리한 작업(동시에 여러 작업)
	}
}