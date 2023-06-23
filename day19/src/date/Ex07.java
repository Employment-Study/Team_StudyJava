package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex07 {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 E W주차 a");
		
		String begin = "2023년 06월 01일";
		String end = "2023년 06월 30일";
		
		Date d1 = sdf.parse(begin);
		Date d2 = sdf.parse(end);
		
		for(long i = d1.getTime(); i <= d2.getTime(); i += 1000 * 60 * 60 * 24) {
			Date t = new Date(i);			// Date생성자에 i(시간값)을 넣어서 객체를 생성할 수 있다.
			String  s = sdf2.format(t);
			System.out.println(s);
			if(s.contains("토")) {
				System.out.println();
			}
		}
	}
}
