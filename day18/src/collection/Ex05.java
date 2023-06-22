package collection;

import java.util.ArrayList;

public class Ex05 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		
		list.add("apple");
		list.add("banana");
		list.add("car");
		list.add("dinosaur");
		list.add("elephant");
		
		System.out.println(list);
		
		System.out.println("list.contains(\"car\") : " + list.contains("car"));
		System.out.println("list.contains(\"carpet\") : "+list.contains("carpet"));
		
		// 앞에서부터 찾아서 찾은위치 (index) 를 반환하고 없으면 -1을 반환한다.  
		System.out.println("list.indexOf(\"car\") : "+list.indexOf("car"));
		System.out.println("list.indexOf(\"carpet\") : "+list.indexOf("carpet"));
		
		// removeIf
		
		list.removeIf(s -> s.contains("r"));
		System.out.println(list);
		
		list.add("carpet");
		list.add("dictionary");
		
		System.out.println(list);
		
		// 정렬 오름차순
		list.sort(null);	
		// String은 Comparable 하기(비교가능한타입) 때문에 별도의 Comparator를 전달하지 않아도 된다.
		
		System.out.println(list);
		
		// 글자수 정렬(Comparator의 compare사용) 
		list.sort((a,b) -> a.length() - b.length());
		// 필요하다면 특정 정렬 기준을 제시하는 Comparator를 전달할 수 있다.
		System.out.println(list);
	}
}
