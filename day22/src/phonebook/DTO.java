package phonebook;

/*
 	NAME    VARCHAR2(100) 
	AGE     NUMBER        
	PNUM    VARCHAR2(20)  
 */

// DB와 Java프로그램사이의 데이터를 옮기기 위해 사용되는 객체(Transfer -> 옮기다.)
public class DTO {
	// Data Transfer Object : 데이터를 이동시키기 위한 클래스, 단일 데이터의 형식을 정의한다.
	
	// 하나의 객체가 이런 구성으로 되어있다.
	// 테이블의 컬럼과 자료형을 클래스의 필드로 구성하는 객체이다.
	private String name;
	private int age;
	private String pnum;
	
	public DTO() {
	
	}
	
	
	DTO(String name, int age, String pnum) {
		this.name = name;
		this.age = age;
		this.pnum = pnum;
	}


	// private 필드를 구성하고 getter/setter를 만든다.
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
	
	@Override
	public String toString() {
		String s = "";
		s += getName() +"\t";
		s += getAge() +"\t";
		s += getPnum() +"\n";
		return s;
	}
	
	
}
