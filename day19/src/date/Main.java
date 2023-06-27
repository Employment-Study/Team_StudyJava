package date;

class Solution{
	boolean isConflict(int n1, int n2, int n3, int n4) {
		boolean answer = false;
		if(n1 >= n3 && n2 > n4) {
			int tmp = n3;
			n3 = n1;
			n1 = tmp;
			
			tmp = n4;
			n4 = n2;
			n2 = tmp;
		}
		System.out.printf("%d %d %d %d\n",n1 , n2, n3, n4);
		if(n2 >= n3) {
			answer =true;
		}
		
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		boolean b1 = s.isConflict(1, 5, 3, 7);
		boolean b2 = s.isConflict(1, 3, 5, 7);
		boolean b3 = s.isConflict(1, 7, 3, 5);
		boolean b4 = s.isConflict(3, 5, 1, 7);
		boolean b5 = s.isConflict(4, 7, 1, 3);
		
		System.out.println("b1 : "+b1);
		System.out.println("b2 : "+b2);
		System.out.println("b3 : "+b3);
		System.out.println("b4 : "+b4);
		System.out.println("b5: "+b5);
		
		
	}
}
