package phonebook;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		DAO dao = new DAO();
		int menu = -1;
		Scanner sc = new Scanner(System.in);
		String name, pnum;
		int age;
		List<DTO> list = null;

		while (menu != 0) {
			System.out.println(" ________________");
			System.out.println("|1. 전체 목록\t |");
			System.out.println("|2. 단일 조회 목록\t |");
			System.out.println("|3. 검색\t\t |");
			System.out.println("|4. 추가\t\t |");
			System.out.println("|5. 수정\t\t |");
			System.out.println("|6. 삭제\t\t |");
			System.out.println("|0. 종료\t\t |");
			System.out.println("|________________|");
			System.out.print("메뉴 선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1: // 전체 출력
				list = dao.selectAll();
				list.forEach(dto -> System.out.print(dto));
				break;
			case 2: // 단일 조회
				System.out.print("이름을 정확하게  입력해주세요 :");
				name = sc.nextLine();
				if (dao.isIn(name)) {
					System.out.print(dao.select(name));
				} else {
					System.out.println("전화번호부에 존재하지 않는 이름입니다.");
				}
				break;
			case 3: // 검색
				System.out.print("검색할 이름 키워드를 입력해주세요 :");
				name = sc.nextLine();
				list = dao.search(name);
				list.forEach(dto -> System.out.print(dto));
				System.out.println();
				break;
			case 4: // 추가
				System.out.print("추가할 사람의 이름을 입력하세요 :");
				name = sc.nextLine();
				System.out.print("추가할 사람의 나이를 입력하세요 :");
				age = Integer.parseInt(sc.nextLine());
				System.out.print("추가할 사람의 전화번호를 입력하세요 :");
				pnum = sc.nextLine();
				int row = dao.insert(new DTO(name, age, pnum));
				System.out.println(row != 0 ? "추가 성공" : "추가 실패");
				break;
			case 5: // 수정
				System.out.print("수정할 사람의 이름을 정확하게 입력하세요 :");
				name = sc.nextLine();
				if (dao.isIn(name)) { // 존재하는지의 여부
					System.out.print("정말 수정하시겠습니까?? (y/n) :");
					String test = sc.nextLine();
					if (test.charAt(0) == 'y' || test.charAt(0) == 'Y') {
						System.out.print("수정할 이름을 입력하세요 :");
						String name2 = sc.nextLine();
						System.out.print("수정할 나이를 입력하세요 :");
						age = Integer.parseInt(sc.nextLine());
						System.out.print("수정할 전화번호를 입력하세요 :");
						pnum = sc.nextLine();
						row = dao.update(new DTO(name2, age, pnum), name);
						System.out.println(row != 0 ? "수정 성공" : "수정 실패");
					} else if (test.charAt(0) == 'n' || test.charAt(0) == 'N') {
						System.out.println("수정 취소");
					} else {
						System.out.println("잘못된 입력입니다.");
					}
				} else {
					System.out.println("입력한 사람이 존재하지 않습니다.");
				}
				break;
			case 6: // 삭제
				System.out.print("삭제할 사람의 이름을 정확하게 입력하세요 :");
				name = sc.nextLine();
				System.out.print("정말 삭제하시겠습니까?? (y/n) :");
				String test = sc.nextLine();
				if (test.charAt(0) == 'y' || test.charAt(0) == 'Y') {
					row = dao.delete(name);
					System.out.println(row != 0 ? "삭제 완료" : "삭제 실패");
				} else if (test.charAt(0) == 'n' || test.charAt(0) == 'N') {
					System.out.println("삭제 취소");
				} else {
					System.out.println("잘못된 입력입니다.");
				}
				break;
			case 0:
				sc.close();
				break;
			default:
				System.out.println("잘못된 메뉴 입력");

			}// end of switch
		} // end of while
	} // end of main
}// end of class
