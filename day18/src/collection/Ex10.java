package collection;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ex10 {
	public static void main(String[] args) throws IOException {
		File f = new File("한국배우목록.txt");
		Scanner sc = new Scanner(f);
		ArrayList<String> list = new ArrayList<>();
		while (sc.hasNextLine()) {
			list.add(sc.nextLine());
		}
		
		HashMap<String , Integer> map = new HashMap<>();
		
		for(String name : list) {
			String familyName = name.substring(0,1);
			map.put(familyName, map.getOrDefault(familyName, 0) + 1);
		}
		
		ArrayList<String> list2 = new ArrayList<String>();
		Set<String> keySet = map.keySet();
		
		for(String key : keySet) {
			int value = map.get(key);
			list2.add(key+":"+value);
		}
		
		list2.sort((a,b) -> {
			int aCnt = Integer.parseInt(a.split(":")[1]);
			int bCnt = Integer.parseInt(b.split(":")[1]);
			return bCnt - aCnt;
		});
		
		list2.forEach(s -> System.out.printf("%s씨는 %s명입니다.\n", s.split(":")[0], s.split(":")[1]));
		
		int total  = 0;
		for(String s : list2) {
			int count = Integer.parseInt(s.split(":")[1]);
			System.out.printf("%s씨는 %s명 입니다. \n",s.split(":")[0], count);
			total += count;
		}
		System.out.println("처음 불러온 파일에서의 데이터 갯수 : "+list.size());
		System.out.println("성 씨로 분류한 인원의 총 합계 : "+total);
		System.out.println(list.size() == total);
		sc.close();
	}
}
