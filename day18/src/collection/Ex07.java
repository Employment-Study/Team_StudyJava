package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		Random ran = new Random();
		// 1 ~ 45 사이의 중복없는 숫자 6개를 뽑아서 오름차순으로 정렬하여 한줄에 출력하세요
		ArrayList<Integer> lottos = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		
		while(set.size()<6) {
			set.add(ran.nextInt(45)+1);		// 1 ~ 45까지
		}
		for(Integer i : set) {
			lottos.add(i);
		}
		
//		set.forEach(num -> lottos.add(num));
//		lottos = new ArrayList<Integer>(set);
		
		lottos.sort(null);
		
		System.out.println("당첨번호입니다 >> "+lottos);
	}
}
