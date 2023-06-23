package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Quiz1 {
	public static void main(String[] args) throws ParseException {
		// 매월 2주, 4주 일요일은 대형 마트 휴무일입니다.
		// 2023년 대형마트 휴무일은 총 몇월 몇일인지 계산하여 출력하세요

		// 각 휴무 날짜를 반복문을 이용하여 출력해보세요.

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일은 휴무일");

		String begin = "2023년 01월 1일 ";
		String end = "2023년 12월 31일 ";

		Date d1 = sdf.parse(begin);
		Date d2 = sdf.parse(end);
		int sunCount = 0;
		int monthCheck = 1;
		int count = 0;
		
		// 1일씩 증가 ( Date의 Time값은 mil/sec 단위이다.)
		for (long i = d1.getTime(); i <= d2.getTime(); i += 1000 * 60 * 60 * 24) {
			Date t = new Date(i); // Date생성자에 i(시간값)을 넣어서 객체를 생성할 수 있다.
			String s = sdf2.format(t);
			
			if(s.split(" ")[3].substring(0, 1).equals("일")) {
				sunCount++;
			}
			
			if ((sunCount == 2 || sunCount == 4)
					&& (s.split(" ")[3].substring(0, 1).equals("일"))) {
				System.out.print(sdf2.format(t)+" ["+sunCount+"]");
				count++;
				if(count % 2 ==0 ) {
					System.out.println();
				}else {
					System.out.print("\t");
				}
			}
			if(Integer.parseInt(s.split(" ")[1].substring(0,2)) != monthCheck) {
				monthCheck++;
				sunCount = 0;
			}
			
		}
		System.out.println("2023년 대형마트 휴무일은 총 "+count+"일 입니다.");		// 24일인지 체크
		// 2,4주차 일요일이 없는 달은 없다. 2x12
	}
}
