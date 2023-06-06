package Unit;

import java.util.Scanner;

import construction.CommandCenter;

public class Main {
public static void main(String[] args) {
	//해당 유닛들 준비
	CommandCenter c1 = new CommandCenter();
	SCV scv1 = new SCV();
	Marine m1 = new Marine();
	Marine m2 = new Marine();
	Medic md1 = new Medic();
	String[] Unitlist = new String[100];
	int unitcnt = 0;
	
	
	
	//확인용 변수
	int row;
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		System.out.println("스타크래프트 ON");
		System.out.println("0. 커맨드건설");
		System.out.println("1. 유닛 생성");
		System.out.println("2. 상태확인");
		System.out.println("3. 공격");
		System.out.println("4. 메딕 힐");
		System.out.println("5. 게임 종료");
		System.out.println("원하는 행동을 입력하세요>>");
		int num = Integer.parseInt(sc.nextLine());
				
		switch (num) {
		case 0:	
			while(true) {
				int select;
				System.out.println("건설할 건물 번호를 입력하세요");
				System.out.println("1. 커맨드 건설");
				select = Integer.parseInt(sc.nextLine());
				if(select ==1 ) c1= new CommandCenter();
				break;
			}
			break;
		case 1:
			while(true) {
			int select;
			System.out.println("\ntest로 유닛은 정해진 수만큼만 생성 가능합니다.");
			System.out.println("재선택시 기존 유닛이 생성되고 새로운 유닛이 생성");
			System.out.println("1. SCV");
			System.out.println("2. Marine, 2마리 생성");
			System.out.println("3. Medic");
			System.out.println("4. 종료");
			System.out.println("생성할 유닛 번호을 입력하세요>>");
			select = Integer.parseInt(sc.nextLine());
			if(select ==1) scv1 = new SCV(); 						
			if(select ==2) m1 = new Marine(); m2 = new Marine(); 	
			if(select ==3) md1 = new Medic(); 						
			if(select == 4) break;
			}
			break;
		case 2:
			while(true) {
				int select;
				System.out.println("\n확인할 유닛의 번호를 선택하세요.");
				System.out.println("1. SCV");
				System.out.println("2. Marine");
				System.out.println("3. Medic");
				System.out.println("4. 종료");
				System.out.println("생성할 유닛 번호을 입력하세요>>");
				select = Integer.parseInt(sc.nextLine());
				if(select ==1) scv1.CheckStatus();						
				if(select ==2) {
					while(true) {
					System.out.println("확인할 유닛 번호를 입력하세요 >> ");
					System.out.println("0번 : 종료");
					int unitNum = sc.nextInt();
					if (unitNum ==1 ) m1.CheckStatus();
					if	(unitNum ==2) m2.CheckStatus();
					if (unitNum == 0) break;
							}//while
					sc.nextLine();
				}
				if(select ==3) md1.CheckStatus(); 						
				if(select == 4) break;
				}
				break;
		case 3:
			while(true) {
				int select;
				System.out.println("공격은 일정하게 진행됩니다.");
				System.out.println("1. SCV");
				System.out.println("2. Marine, 2마리 공격");
				System.out.println("3. Medic");
				System.out.println("4. 종료");
				System.out.println("\n공격할 유닛의 번호를 선택하세요>>");
				select = Integer.parseInt(sc.nextLine());
				if(select ==1) scv1.Attack(m1); 						
				if(select ==2) {
					while(true) {
					System.out.println("공격할 유닛 번호를 입력하세요 >> ");
					System.out.println("1번 : m2공격");
					System.out.println("2번 : m1공격");
					System.out.println("0번 : 종료");
					int unitNum = sc.nextInt();
					if (unitNum ==1 ) {m1.Attack(m2);}
					if	(unitNum ==2) {m2.Attack(m1);}
					if (unitNum ==0) {break;}
							}//while
					sc.nextLine();
				}
				if(select ==3) md1.Attack(scv1); 						
				if(select == 4) break;
				}
				break;
		case 4:
			while(true) {
				int select;
				System.out.println("1. SCV");
				System.out.println("2. Marine");
				System.out.println("3. Medic");
				System.out.println("4. 종료");
				System.out.println("\n힐링할 유닛의 번호를 입력하세요>>");
				select = Integer.parseInt(sc.nextLine());
				if(select ==1) md1.Healing(m1); 						
				if(select ==2) {
					while(true) {
					System.out.println("힐링할 유닛 번호를 입력하세요 >> ");
					System.out.println("1번 : m1");
					System.out.println("2번 : m2");
					System.out.println("0번 : 종료");
					int unitNum = sc.nextInt();
					if (unitNum ==1 ) {md1.Healing(m1); break;}
					if	(unitNum ==2) {md1.Healing(m2); break;}
							}//while
					sc.nextLine();
				}
				if(select ==3) md1.Healing(scv1); 						
				if(select == 4) break;
				}
				break;
		case 5:
			
			return;
		}//switch
		
		
		
	}//while(질문 무한 반복)
	
	
	
	
	
}//main
}//class
