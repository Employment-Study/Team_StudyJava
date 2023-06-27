package day21;

public class PhoneBookInfo {
	
	private String name;
	private int age;
	private String pnum;
	
	PhoneBookInfo(String name, int age, String pnum) {
		this.name = name;
		this.age = age;
		this.pnum = pnum;
	}
	
	@Override
	public String toString() {
		
		// 정수를  %s로 format할 수 있는 이유는 Integer로 Wrapper클래스로 변환이 가능하고 모든 클래스는 toString을 오버라이딩할 수 있기 때문이다.
		return String.format("%s, %s, %s", name, age, pnum);
	}
	
	// 기본 생성자
	public PhoneBookInfo() {}
	
	// Getter & Setter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPnum() {
		return pnum;
	}

	public void setPnum(String pnum) {
		this.pnum = pnum;
	}
	
	
	
}
