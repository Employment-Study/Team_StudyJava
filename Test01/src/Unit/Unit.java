package Unit;

import java.util.function.Predicate;

//특성(필드에 필요한 값)
//유닛 체력,마나, 공격력

//행동
//이동, 공격 

public class Unit {
	//Member Field
	private int Hp;
	private int Mp;
	private int offencePower;
	private int x;
	private int y;
	private static int num=0; 
	private boolean life = true;
	 
	
	//Getter Setter
	public int getHp() {
		return Hp;
	}
	public void setHp(int hp) {
		Hp = hp;
	}
	public int getMp() {
		return Mp;
	}
	public void setMp(int mp) {
		Mp = mp;
	}
	public int getOffencePower() {
		return offencePower;
	}
	public void setOffencePower(int offencePower) {
		this.offencePower = offencePower;
	}
	
	//Constructor
	public Unit(int hp, int mp, int offencePower, int x, int y) {
		Hp = hp;
		Mp = mp;
		this.offencePower = offencePower;
		this.x = x;
		this.y = y;
		
	}
	
	//Check Status
	public void CheckPos(Unit unit) {
		System.out.printf("유닛%d의 현재 위치 : (%02d, %02d)%n",unit.num,x,y);
	}
	public void CheckStatus() {
		if(this.Hp == 0) {
			System.out.println("현재 해당 유닛은 전사했습니다.");
			life = !life;				
		}
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
	
	
	//Action
	public void Move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void Attack(Unit unit) {
		if(life) {
			if(unit.Hp >this.offencePower) {
				unit.Hp -= this.offencePower;
				unit.CheckStatus();	
				}
			else {
				life=!life;
				System.out.println("해당 유닛이 전사했습니다.");
			}
		}
		else System.out.println("이미 전사");
		
	}
	
	
	
	
	
	
	
	
	
}
