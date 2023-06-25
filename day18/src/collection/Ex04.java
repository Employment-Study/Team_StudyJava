package collection;

import java.util.ArrayList;
// 부모클래스 : 학생
abstract class Student {
	private String name;
	private int kor, eng, mat;
	private int sum;
	private double avg;

	Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.sum = kor+eng+mat;
		this.avg = sum / 3.0;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
// 인문학 학생
class Literalstudent extends Student{
	private int literature;
	
	Literalstudent(String name, int kor, int eng, int mat, int literature) {
		super(name, kor, eng, mat);
		this.literature = literature;
		setSum(kor+eng+mat+literature);
		setAvg(getSum()/4.0);
	}

	public int getLiterature() {
		return literature;
	}
	public void setLiterature(int literature) {
		this.literature = literature;
	}
	
}

// 컴공과 학생
class ComputerScienceStudent extends Student {
	private int c, java;

	ComputerScienceStudent(String name, int kor, int eng, int mat, int c, int java) {
		super(name, kor, eng, mat);
		this.c = c;
		this.java = java;
		setSum(kor+eng+mat+c+java);
		setAvg(getSum()/ 5.0);
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

}

public class Ex04 {
	public static void main(String[] args) {
		
		// 제네릭 타입을 Student로 지정하여 Student에 해당하는 객체만 넣을 수 있게 한 경우
		// 좌변에는 제네릭 타입을 명시하는 것이 맞고 우측에는 비워도 상관없다
		ArrayList<Student> list = new ArrayList<>();
		
		Literalstudent st1 = new Literalstudent("짱구", 67, 78, 89, 90);
		ComputerScienceStudent st2 = new ComputerScienceStudent("철수", 45, 56, 67, 89, 92);
		
		list.add(st1);
		list.add(st2);
		
		list.forEach(st -> System.out.printf("%s : %.2f \n",st.getName(),st.getAvg()));
		
		// 만약, 제네릭 타입을 지정하지 않은 리스트에 동일한 작업을 수행한다면...
		ArrayList list2 = new ArrayList();
		
		list2.add(st1);
		list2.add(st2);
		
//		list2.forEach(st -> System.out.printf("%s : %.2f\n", st.getName(), st.getAvg()));
		
		for(int i=0;i<list.size();i++) {
			Object o = list.get(i);
			Student st = (Student) o;			// 다운 캐스팅을 해줘야 내부 함수를 사용가능하다
			System.out.printf("%s : %.2f\n", st.getName(), st.getAvg());
		}
	}
}
