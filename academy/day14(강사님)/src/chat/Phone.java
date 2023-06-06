package chat;

public class Phone {

	private String name;
	private String message;
	
	public Phone(String name) {
		this.name = name;
	}
	
	// 문자열 메시지를 다른 Phone에게 보내기
	public void sendMessage(Phone target, String message) {
		target.recieveMessage(this, message);
	}
	
	// 전달받은 메시지를 화면에 출력하기
	public void recieveMessage(Phone sender, String message) {
		this.message = message;
		System.out.println("메시지 도착 from " + sender.name);
		showMessage();
	}

	public void showMessage() {
		System.out.println("내용 : " + message);
		System.out.println();
	}
}
