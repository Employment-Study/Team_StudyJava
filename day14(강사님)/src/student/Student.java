package student;

// 학생관리 프로그램에서 1명의 학생 정보를 저장할 객체의 클래스를 구성합니다
// 이름, 국어, 영어, 수학, 합계, 평균(실수, 소수점둘째자리까지 출력) 정보를 저장합니다
// 생성자에서는 이름과 국영수 점수만 전달받습니다
// 국영수 점수를 이용하여 합계와 평균을 계산하여 저장합니다
// show() 함수를 작성하여 이름과 합계 및 평균을 화면에 출력합니다
// 필드는 private, 생성자와 메서드는 public으로 설정합니다

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = kor + eng + math;
		avg = sum / 3.0;
	}
	
	public void show() {
		System.out.printf("%s) 합계 : %d, 평균 : %.2f\n", name, sum, avg);
	}
	
	public String getName() {
		return name;
	}
}






