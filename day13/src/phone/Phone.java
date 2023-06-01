package phone;

import java.util.ArrayList;
import java.util.Scanner;


public class Phone {
	private String name;			// 이름
	private String sendMsg;			// 내가 보내는 메시지
	private String recievedMsg;		// 내가 받은 메시지
	private boolean power;			// 휴대폰 켜져 있는지
	private ArrayList<String> messages;
	private Scanner sc;
	
	Phone(String name) {
		this.power = false;
		this.sc = new Scanner(System.in);
		this.name = name;
		this.messages = new ArrayList<String>();
		this.sendMsg="";
		this.recievedMsg="";
	}

	public void menu() {
		int menu = 1;
		
		while(menu!=0) {
			System.out.print("메뉴를 입력하세요 >> ");
			menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				break;
				
			default:
				break;
			}
		}
		
	}
	
	public void turn() {
		setPower(!power);
	}
	
	// 문자 보내기
	public void send(Phone other, String msg) {
		if(isPower()) {
			msg = this.getName()+" : "+msg;				// 보낸사람 : 메시지 내용
			this.setSendMsg(msg);			// 내가 보낸 메시지
			this.setMessages(msg);			// 메시지
			other.recieve(this, msg);		// 다른사람이 메시지를 받는다.
		}
		
	}
	
	// 문자 받기
	public void recieve(Phone sender, String msg) {
		if(power)
			msg = msg;
			this.setMessages(msg);
			this.setRecievedMsg(msg);					// 받은 메시지
	}	
	
	// 메시지 창 보기
	public void show_message(Phone other) { // 보낸 사람이름으로 메시지 확인
		int count = 10;
		
		System.out.println("____________________________________________________________________");
		System.out.println("\t\t\t\t"+other.getName()+"\t\t\t\t");
		for(String message : messages) {
			if(message.split(" : ")[0].equals(other.getName())) {
				System.out.printf("| %-50s \t\t | \n",message);
			}else if(message.split(" : ")[0].equals(this.getName())){
				message = message.replace(this.getName(), "나");
				System.out.printf("| %50s \t\t | \n",message);
			}else {
				System.out.print("");
			}
		}
		
		System.out.println("____________________________________________________________________");
	}
	
	// 전화걸기
	
	// 통화 실패(전화기가 꺼져 있어...소리샘..)
	
	// 부재중
	
	// 통화 연결 성공
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSendMsg() {
		return sendMsg;
	}
	public void setSendMsg(String sendMsg) {
		this.sendMsg = sendMsg;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public String getRecievedMsg() {
		return recievedMsg;
	}

	public void setRecievedMsg(String recievedMsg) {
		this.recievedMsg = recievedMsg;
	}

	public ArrayList<String> getMessages() {
		return messages;
	}

	public void setMessages(String msg) {
		this.messages.add(msg);
	}
	

}
