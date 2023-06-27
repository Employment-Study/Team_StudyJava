package date;

import java.text.SimpleDateFormat;
import java.util.Date;

class Solution2{
	boolean isConflict(Date n1, Date n2, Date n3, Date n4) {
		boolean answer = false;
		long ln1 = n1.getTime();
		long ln2 = n2.getTime();
		long ln3 = n3.getTime();
		long ln4 = n4.getTime();
		
		if(ln1 >= ln3 && ln2 > ln4) {
			long tmp = ln3;
			ln3 = ln1;
			ln1 = tmp;
			
			tmp = ln4;
			ln4 = ln2;
			ln2 = tmp;
		}

		if(ln2 >= ln3) {
			answer =true;
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		String p1 = String.format("[%s ~ %s]", sdf.format(n1), sdf.format(n2));
		String p2 = String.format("[%s ~ %s]", sdf.format(n3), sdf.format(n4));
		
		System.out.printf("%s와 %s는 %s\n\n", p1, p2, answer ? "겹친다." : "안겹친다.");
		
		return answer;
	}
}

public class Main2 {
	public static void main(String[] args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = sdf.parse("2023-01-01");
		Date d2 = sdf.parse("2023-06-10");
		Date d3 = sdf.parse("2023-05-01");
		Date d4 = sdf.parse("2023-12-31");
		
		Solution2 s = new Solution2();
		 s.isConflict(d1, d3, d2, d4);
		 s.isConflict(d1, d2, d3, d4);
		 s.isConflict(d1, d4, d2, d3);
		 s.isConflict(d2, d3, d1, d4);
		 s.isConflict(d3, d4, d1, d2);
		
		
	}
}
