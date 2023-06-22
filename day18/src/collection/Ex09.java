package collection;

import java.util.ArrayList;

public class Ex09 {
	
	// Queue : First In First Out, 먼저 들어간 데이터가 먼저 나오는 구조
	// 순서대로 데이터를 처리하기 위해 사용하는 형식

	private static ArrayList<String> list = new ArrayList<>();
	
	static void enqueue(String value) {
		list.add(value);
	}
	
	static String dequeue() {
		if(list.size() == 0) {
			return null;
		}
		return list.remove(0);
	}
	
	public static void main(String[] args) {
		enqueue("짜장");
		enqueue("짬뽕");
		System.out.println(dequeue());
		System.out.println(dequeue());
		System.out.println(dequeue());
	}
}
