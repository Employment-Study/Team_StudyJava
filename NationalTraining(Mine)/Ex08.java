package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex08 {
public static void main(String[] args) throws ParseException {
	// 서로 다른 두 기간을 날짜로 입력받아서
	// 두 기간이 겹치는지 아닌지 판별하는 코드를 작성해봅시다.
	
	Scanner sc = new Scanner(System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Calendar calA = Calendar.getInstance();
	Calendar calAtoB = Calendar.getInstance();
	Calendar calC = Calendar.getInstance();
	Calendar calCtoD = Calendar.getInstance();
	
//	System.out.println("기간1 시작일 : ");
//	Date period1Begin = sdf.parse(sc.nextLine());	//2023-06-10
	calA.set(2023, 06,10);
	
//	System.out.println("기간1 종료일 : ");
//	Date period1End = sdf.parse(sc.nextLine());		//2023-06-14
	calAtoB.set(2023, 06,15);
	
//	System.out.println("기간2 시작일 : ");
//	Date period2Begin = sdf.parse(sc.nextLine());	//2023-06-15
	calC.set(2023, 06,15);
	
//	System.out.println("기간2 종료일 : ");
//	Date peroid2End = sdf.parse(sc.nextLine());		//2023-06-30
	calCtoD.set(2023, 06,30);
	
	
	//1. 시작이 더 작은 것을 앞으로, 오래된 것을 뒤로해서 조건을 따져봄
	long Astart = calA.getTimeInMillis();
	long AEnd = calAtoB.getTimeInMillis();
	
	long Cstart = calC.getTimeInMillis();
	long CEnd = calCtoD.getTimeInMillis();
	// 0이면 AStart가 기준점, 1이면 CStart가 기준점
	long flag=  Astart<=Cstart? 0:1;
	
	int row = 0;
	//Astart가 기준점일때, row가 1이면 겹치는 기간이 있다. 
	if(flag==0) row = AEnd-Cstart>=0?1:0;
	//Cstart가 기준점일때, row가 1이면 겹치는 기간이 있다.
	if(flag==1) row = CEnd-Astart>=0?1:0;
	System.out.println(row==0?"겹치는 기간 없음":"겹치는 기간 있음");
	
	long answer =0;
	if(row ==1 &&flag==0) {
		System.out.println("!");
		answer = AEnd-Cstart;
		System.out.println(answer/(24*60*60*1000)+1);
	}
	if(row==1 && flag ==1) {
		System.out.println("@");
		answer = CEnd-Astart;
	System.out.println(answer/(24*60*60*1000)+1);}
	


}
}
