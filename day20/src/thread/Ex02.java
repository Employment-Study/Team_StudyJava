package thread;

class Jobc extends Object implements Runnable{
	// 생성자에서 start하는 방법
	public Jobc() {
		Thread th = new Thread(this);
		th.start();
	}
	
	@Override
	public void run() {
		for(char ch = 'a'; ch < 'z'; ch++) {
			System.out.print(ch + " ");
		}
	}
} 

public class Ex02 {
	// main함수도 하나의 스레드 안에서 작동한다.
	public static void main(String[] args) {
		
//		ob.start();	// runnable을 상속받으면 start를 바로 쓸 수 없다.(메서드가 없음) 
//		
		Jobc ob = new Jobc();
//										// Thread
//		Thread th = new Thread(ob);		// runnable을 생성자 매개변수에 전달
//		th.start();						// runnable을 참조하는 thread의 start호출
	
		for(int i=1;i<=25;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
