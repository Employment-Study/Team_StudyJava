package phone;

public class Main {
	public static void main(String[] args) {
		Phone ph1 = new Phone("홍길동");
		Phone ph2 = new Phone("장보고");
		Phone ph3 = new Phone("임꺽정");
		
		
		ph1.send(ph2,"msg1");
		ph1.send(ph3,"msg2");
		ph2.send(ph3,"msg3");
	}
}
