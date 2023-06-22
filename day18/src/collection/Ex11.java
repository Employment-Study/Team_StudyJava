package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Ex11 {
	public static void main(String[] args) {
		// 1부터 1000 사이의 정수중에서
		// 3의 배수, 5의 배수, 7의 배수의 갯수를 각각 구하세요

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=1;i<=1000;i++) {
			if(i%3 == 0) {
				map.put("3의 배수", 1000/3);
			}
			if(i%5 == 0) {
				map.put("5의 배수", 1000/5);
			}
			if(i%7==0) {
				map.put("7의 배수", 1000/7);
			}
		}		
		
		Set<String> keySet = map.keySet();
		List<String> entList = new ArrayList<String>(keySet);
		entList.sort(null);		// 키를 정렬
		
		for(String s : entList) {
			System.out.printf("[ %s : %d 개] \n",s,map.get(s));
		}
	}
}
