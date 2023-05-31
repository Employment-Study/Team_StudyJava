package phone;

public class Phone {
	private String name;
	private String msg;
	private boolean isOn;			// 휴대폰 켜져 있는지

	Phone(String name) {
		this.name = name;
	}

	// 문자 보내기
	public void send(Phone other, String msg) {
		System.out.println(other.getName()+"님에게 문자메시지 보내기\n " +this.getName()+"의 문자메시지 입니다 \n");
		System.out.println("내용 : "+msg);
		other.recieve(this, msg);
	}
	
	// 문자 받기
	public void recieve(Phone sender, String msg) {
		System.out.println(this.getName()+"님 "+sender.getName()+"님이 온 문자메시지를 보내왔습니다! \n");
		System.out.println("내용 : "+msg);
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
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}
	
}
