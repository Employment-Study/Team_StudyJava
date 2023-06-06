package createClass;

public class Unit {	// 슈퍼클래스
	private String name;	// 이름
	private double HP;		// hp
	private double ATK;		// 공격력
	private double DEF;		// 방어력

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHP() {
		return HP;
	}

	public void setHP(double hP) {
		HP = hP;
	}

	public double getATK() {
		return ATK;
	}

	public void setATK(double aTK) {
		ATK = aTK;
	}

	public double getDEF() {
		return DEF;
	}

	public void setDEF(double dEF) {
		DEF = dEF;
	}

	Unit(String name, double HP, double ATK, double DEF) {	// 유닛 생성
		this.name = name;
		this.HP = HP;
		this.ATK = ATK;
		this.DEF = DEF;
	}

	void Attack(Unit other) {	// "내"가 "상대"에게 "입히는" 데미지
		double damage = other.Defend(this);	// 내가 상대에게 공격을 하면, 상대는 방어한다
		System.out.printf("%s의 평타\n", this.name);
		System.out.printf("%s가 %s에게 입힌 데미지 : %.2f\n", this.name, other.name, damage);
	}

	double Defend(Unit other) {	// "내"가 "상대"에게 "받는" 데미지
		double damage = other.ATK - this.DEF; // 상대의 공격력에서 내 방어력을 뺀 만큼이 데미지
		if(damage <= 0) {
			damage *= -1;
		}
		this.HP -= damage;	// "내" HP가, 데미지만큼 빠진다
		return damage;	// 내가 받은 데미지 = 상대가 준 데미지이므로, 데미지를 리턴
	}
}
