package handphone;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	Handler handler = new Handler();
	HandPhone hp;
	HandPhone[] arr;
	int row;
	
	//더미 데이터
	
			handler.insert(new SmartPhone("S22", "2015", 15805, true));
			handler.insert(new SmartPhone("S20", "2000", 9409, true));
			handler.insert(new FolderblePhone("a1", "2017"	, 1234, true));
			handler.insert(new FolderblePhone("a2", "2010"	, 1134, true));
	
	
	
	while(true) {
		System.out.println("1. 목록출력");
		System.out.println("2. 폰 추가");
		System.out.println("3. 폰기종 검색");
		System.out.println("4. 정렬");
		System.out.println("5. 삭제");
		System.out.println("0. 종료");
		System.out.println("선택: ");
		int key = Integer.parseInt(sc.nextLine());
		switch (key) {
		case 1:									//목록
			arr =handler.selectAll();
			for(HandPhone i : arr) if(i!=null)System.out.println(i);
			break;
		case 2:									//추가
			System.out.println("추가할 핸드폰을 골라주세요");
			System.out.println("1.SmartPhone 2.FoldablePhone");
			int num = Integer.parseInt(sc.nextLine());
			hp = num == 1 ? makeSmart(sc): makeFoldable(sc);
			row = handler.insert(hp);
			System.out.println(row==1? "추가 성공":"추가 실패");
			
			
			break;
		case 3:									//검색
			System.out.println("검색할 폰 이름을 적어주세요 : ");
			String search = sc.nextLine();
			arr = handler.findList(search);
			for(HandPhone x : arr) System.out.println(x);
			break;
		case 4:									//정렬
			System.out.println("정렬할 필터(기준)을 선택해주세요");
			System.out.println("1.이름순 2.번호순 3.출시일");
			int num3 = Integer.parseInt(sc.nextLine());
			
			handler.sort(num3);
			
			
			break;
		case 5:									//삭제
			System.out.println("삭제할 기종 이름을 적어주세요");
			String select = sc.nextLine();
			row = handler.delete(select);
			System.out.println(row ==1 ? "삭제 성공":"삭제 실패");
			break;
		case 0:									//종료
			sc.close();
			System.out.println("종료.");
			break;
		
		default:
				System.err.println("잘못된 입력입니다. 다시 입력해주세요");
			return;
			}
		System.out.println();
		row =0;
		}
	}

	private static HandPhone makeFoldable(Scanner sc) {
		System.out.println("이름 :");
		String name = sc.nextLine();
		System.out.println("출시일: ");
		String publishDate = sc.nextLine();
		System.out.println("전화번호: ");
		int number = Integer.parseInt(sc.nextLine());
		boolean fold = true;
		
		FolderblePhone fp = new FolderblePhone(name, publishDate, number, fold);
		return fp;
	}

	private static HandPhone makeSmart(Scanner sc) {
		System.out.println("이름 :");
		String name = sc.nextLine();
		System.out.println("출시일: ");
		String publishDate = sc.nextLine();
		System.out.println("전화번호: ");
		int number = Integer.parseInt(sc.nextLine());
		boolean touch = true;
		
		SmartPhone sp = new SmartPhone(name, publishDate, number, touch);
		return sp;
	}
	
	
	
	
	
	
	
	
	
}
