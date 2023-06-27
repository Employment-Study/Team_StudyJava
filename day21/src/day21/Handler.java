package day21;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Handler {
	private ArrayList<PhoneBookInfo> list = new ArrayList<>();
	private final String fileName = "phonebook.txt";
	
	// 저장
	public int save(String name, int age, String pnum) throws Exception {
		int row = 0;
		// 1) 파일을 대상으로 하는 출력 통로를 개설해야 한다.
		File f = new File(fileName);
		
		if(f.exists() == false) {
			f.createNewFile();			// 지정한 이름으로 파일을 생성하고 불러오는 내용을 수행하지 않는다.
		}
		list.add(new PhoneBookInfo(name,age,pnum));
		// 2) FileWriter 객체를 이용하여 문자열을 기록한다.
		FileWriter fw = new FileWriter(f);
		for(int i=0;i<list.size();i++) {
			fw.append(list.get(i).toString()+"\n");
		}
		fw.flush();
		row++;
		
		fw.close();
		return row;
	}
	
	// 불러오기
	public void load() throws Exception{
		File f = new File(fileName);
		// 만약에 파일이 없으면
		if(f.exists() == false) {
			f.createNewFile();			// 지정한 이름으로 파일을 생성하고 불러오는 내용을 수행하지 않는다.
			return;									// 불러올것이 없기 때문에 이 시점에서 함수를 종료한다.
		}
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			String name = line.split(", ")[0];
			int age = Integer.parseInt(line.split(", ")[1]);
			String pnum = line.split(", ")[2];
			
			list.add(new PhoneBookInfo(name,age,pnum));
		}
		sc.close();
	}
	
	// 전체 목록
	public void selectAll() {
		for(PhoneBookInfo n : list) {
			System.out.println(n.toString());
		}
	}
	
	// 검색(이름으로 검색)
	public void search(String keyword) throws Exception {
		File f = new File(fileName);
		Scanner sc = new Scanner(f);
		ArrayList<PhoneBookInfo> list2 = new ArrayList<>();
		while (sc.hasNextLine()) {
			String s = sc.nextLine();
			if(s.contains(keyword)) {
				list2.add(new PhoneBookInfo(s.split(", ")[0], Integer.parseInt(s.split(", ")[1]), s.split(", ")[2]));
			}
		}
		for(int i=0;i<list2.size();i++) {
			System.out.println(list2.get(i));
		}
		sc.close();
	}
	
	// 삭제
	public int delete(String pnum) throws Exception {
		int row = 0;
		File f = new File(fileName);
		Scanner sc = new Scanner(f);
		
		while (sc.hasNextLine()) {
			String s = sc.nextLine();
			String phoneNum = s.split(", ")[2];
			
			if(phoneNum.equals(pnum)) {
				for(int i =0;i<list.size();i++) {
					if(list.get(i).toString().contains(pnum)) {
						list.remove(i);
						break;
					}
				}

				FileWriter fw = new FileWriter(f);
				for(int i=0;i<list.size();i++) {
					fw.append(list.get(i).toString()+"\n");
				}
				fw.flush();
				row++;
				fw.close();
				break;
			}
		}

		sc.close();
		return row;
	}
}
