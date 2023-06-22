package collection;

import java.util.HashSet;

public class Ex06 {
	public static void main(String[] args) {
		// Set : 순번이 없고, 값의 중복을 허용하지 않는다.
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		// Generic Type에는 primitive 타입을 지정할 수 없다.
		// 대신 Wrapper class를 이용하여 지정할 수 있다.
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(20);								// 중복을했기에 추가는 되지 않지만 기존의 것을 덮어쓴것이다(오류가 발생하지 않는다)
		System.out.println(set);	// 중복을 허용하지 않아서 20이 추가되지는 않는다.
		
		// 순번이 없어서, 특정 값을 지정해서 불러올 수 없다.
		//		System.out.println(set.get(0));
		
		for(Integer num : set) {
			System.out.println(num);
		}
		System.out.println();
	}
	
}
