package file;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) throws Exception {
		
		//1) 한국 배우 목록.txt 파일을 불러 올 수 있도록 파일 객체를 생성하세요
		File actor = new File("한국배우목록.txt");
		
		// 파일 객체를 출력하면 파일 이름이 튀어나온다.
		System.out.println("actor : "+actor);
		System.out.println("actor.getAbsolutePath() : "+actor.getAbsolutePath());
		System.out.println("actor.length() : "+actor.length());
		
		// 2) 파일 내용을 이용하여 이름이 3글자인 사람 대상으로 하여 성씨 별로 인원수가 몇명인지 확인할 수 있는 HashMap을 만들어
		
		if(actor.exists()) {
			Scanner sc = new Scanner(actor);
			HashMap<String, Integer> firstNameMap = new HashMap<String, Integer>();
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				if(line.length() == 3) {
					if (firstNameMap.get(line.substring(0, 1)) != null) {
						firstNameMap.put(line.substring(0, 1), firstNameMap.get(line.substring(0,1))+1);
					}else {
						firstNameMap.put(line.substring(0, 1), 1);
					}
				}
			}
			
			System.out.println("HashMap : "+firstNameMap);

//			Set<String> keys = firstNameMap.keySet();
//			ArrayList<String> sortedList = new ArrayList<String>(keys);
//			sortedList.sort(null);
//			
//			for(String k : sortedList) {
//				System.out.println(k+ " : "+ firstNameMap.get(k)+"명");
//			}
			
			ArrayList<String> list = new ArrayList<String>();
			Iterator<String> it = firstNameMap.keySet().iterator();
			while(it.hasNext()) {
				String key  = it.next();
				int value = firstNameMap.get(key);
				list.add(key + "=" + value);
			}
			list.sort(null);
			list.forEach(s -> System.out.println(s));
			
			System.out.println("인원수 순으로 출력!!");
			list.sort((a,b) -> {
				int v1= Integer.parseInt(a.split("=")[1]);
				int v2 = Integer.parseInt(b.split("=")[1]);
				return v2 - v1;
			});
			list.forEach(s -> System.out.println(s));
		}
	}
}
