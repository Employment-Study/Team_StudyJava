package Unit;

import java.util.function.Predicate;

public class Marine extends Unit{
	String name = "마린";
	private static int cnt=0;
	public final static int MAX_HP = 50;
	Predicate<Marine> p = i -> i.getHp()!=0;
	public Marine() {
		super(50, 30, 9, 0, 0);
		cnt++;
		System.out.printf("마린%d이(가) 생성되었습니다.%n",cnt);
	}
	
	//row=1 스팀팩 활성화 가능 row =0 스팀팩 사용 불가
	public void CheckStatus() {
		if(this.getMp() == 0) {System.out.println("현재 해당 유닛은 전사했습니다.");}
		else 
			{
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.printf("        유닛의 현재 상태\t        %n"
					+ " ―――――――――――――――――― %n"
					+ "        체력: %d\t        %n"
					+ "        마나: %d\t        %n"
					+ "        공격력:%d\t        %n"
					+ "┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛"
					+ "%n",this.getHp(),this.getMp(),this.getOffencePower());
			}
		
	}
	public int SteamPack() {
		int row=0;				// 결과 확인용
		if (p.test(this)) {
			if(this.getHp()-5!=0) {
				this.setHp(this.getHp()-5);
				System.out.println("스팀팩 활성화");
				row =1;
				this.CheckStatus();
				}
			else {System.out.println("!!경고!!\n한번 더 사용하실 경우 사망합니다.");	this.CheckStatus();}
		}//생존시
		else System.out.println("현재 유닛은 현재 스팀팩을 사용할 수 없습니다.");
		
		return row;
		
		}
	
	
	
}//end of Class
