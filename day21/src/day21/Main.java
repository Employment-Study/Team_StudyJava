package day21;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Handler handler = new Handler();
		handler.load(); // 특정 파일 이름의 데이터를 리스트에 불러오기		
		Scanner sc = new Scanner(System.in);
		int result  = 0;
		while(true) {
			System.out.println("_____________");
			System.out.println(" 메뉴판입니다. ");
			System.out.println(" 1. 추가");
			System.out.println(" 2. 전체 목록 출력");
			System.out.println(" 3. 키워드로 검색");
			System.out.println(" 4. 목록 삭제");
			System.out.println(" 0. 프로그램 종료");
			System.out.println("_____________");
			System.out.print("메뉴를 입력하세요 >> ");
			
			int menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				System.out.print("이름을 입력하세요 >> ");
				String name = sc.nextLine();
				System.out.print("나이를 입력하세요 >> ");
				int age = Integer.parseInt(sc.nextLine());
				System.out.print("전화 번호를 입력하세요 >> ");
				String pnum = sc.nextLine();
				
				result = handler.save(name, age, pnum);
				System.out.println(result == 0 ? "추가 실패" : "추가 성공");
				break;
			case 2:
				handler.selectAll();
				break;
			case 3:
				System.out.print("검색할 키워드를 입력하세요>> ");
				handler.search(sc.nextLine());
				break;
			case 4:
				System.out.print("전화번호부에서 삭제할 사람의 번호를 입력하세요");
				result = handler.delete(sc.nextLine());
				System.out.println(result==0 ? "삭제 실패" : "삭제 성공");
				break;
			case 0:
				sc.close();
				return;
			default:
				System.out.println("잘못된 메뉴 입력");
				break;
			}
		}
	}
}
