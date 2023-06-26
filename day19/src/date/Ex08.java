package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) throws ParseException {
		// 서로 다른 두 기간을 날짜로 입력받아서 
		// 두 기간이 겹치는 지 아닌지 판별하는 코드를 작성
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.print("기간1 시작일 : ");
		Date period1Begin = sdf.parse(sc.nextLine());
		
		System.out.print("기간2 종료일 : ");
		Date period1End = sdf.parse(sc.nextLine());
		
		System.out.print("기간1 시작일 : ");
		Date period2Begin = sdf.parse(sc.nextLine());
		
		System.out.print("기간2 종료일 : ");
		Date period2End = sdf.parse(sc.nextLine());
		
		
		Date beforeBegin = period1Begin.getTime() > period2Begin.getTime() ? period2Begin : period1Begin;
		Date afterBegin = period1Begin.getTime() < period2Begin.getTime() ? period2Begin : period1Begin;
		
		
		 
//		System.out.println(flag1 ? "겹침" : "겹치치 않음");
		
		
		sc.close();
		
	}
}
