package file;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) throws Exception {
		
		// 1) 한국배우목록.txt 파일을 불러올 수 있도록 파일 객체를 생성하세요
		// 파일 객체를 바로 출력해보세요
		
		File f = new File("한국배우목록.txt");
		System.out.println(f);
		System.out.println(f.toString());
		System.out.println(f.getName());			// 파일 이름
		System.out.println(f.getAbsolutePath());	// 절대 경로
		System.out.println(f.length());				// 용량, 파일 크기
		System.out.println();
		
		// 2) 파일 내용을 이용하여 이름이 3글자인 사람만 대상으로 하여
		// 성씨별로 인원수가 몇명인지 확인할 수 있는 HashMap을 만들어주세요
		
		HashMap<String, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			if(line.length() == 3) {
				String key = line.substring(0, 1);
				map.put(key, map.getOrDefault(key, 0) + 1);
			}
		}
		sc.close();
		
		for(String key : map.keySet()) {
			int value = map.get(key);
			System.out.printf("%s씨는 %d명\n", key, value);
		}
		System.out.println();
		
		// 3) 리스트에 넣어서 성씨 순으로 혹은 인원 순으로 정렬해보기
		System.out.println(map);
		
		ArrayList<String> list = new ArrayList<>();
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			int value = map.get(key);
			list.add(key + "=" + value);
		}
		
		list.sort(null);
		list.forEach(s -> System.out.println(s));
		
		System.out.println("인원수 순으로 정렬하여 출력 !!");
		list.sort((a, b) -> {
			int v1 = Integer.parseInt(a.split("=")[1]);
			int v2 = Integer.parseInt(b.split("=")[1]);
			return v2 - v1;
		}); 
		list.forEach(s -> System.out.println(s));
		
		
		
		
	}
}
