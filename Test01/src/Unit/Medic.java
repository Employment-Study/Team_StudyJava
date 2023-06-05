package Unit;

import java.util.function.Predicate;

public class Medic extends Unit{
	//Member Field
	private int Heal=5;
	private static int cnt=0;
	Predicate<Unit> p = i -> i.getHp()!=0;
	
	
	//Constructor
	public Medic() {
		super(40, 100, 2, 0, 0);
		System.out.printf("메딕%d이(가) 생성되었습니다.%n",cnt);
		cnt++;
	}
	
	//마나채우기
	public void Stop() {
		this.setMp(this.getMp()+10);
		this.CheckStatus();
	}
	
	//Healing
	public int Healing(Unit unit) {
		int row =0;
		
		//마나부족시
		if(this.getMp()==0) {
			System.out.println("마나가 부족합니다.");
			return row;
		}
		
		//적용 가능(체력이 가득 차면 알람)
		if(p.test(unit)&& this.getMp()!=0) {
			unit.setHp(unit.getHp()+Heal);
			System.out.println("힐링중...+");
			this.setMp(this.getMp()-10);
			unit.CheckStatus();
			row =1;
		}
		
		//적용 불가
		else {
			System.out.println("적용불가 대상(사망)");
		}
		return row;
	}
}
