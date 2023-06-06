package createClass;

public class Unit {
	private String name;
	private double HP;
	private double ATK;
	private double DEF;
	
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

	Unit(String name, double HP, double ATK, double DEF){
		this.name = name;
		this.HP = HP;
		this.ATK = ATK;
		this.DEF = DEF;
	}
	
	void Attack(Unit other) {
		other.Defend(this);
		System.out.printf("%s에게 입힌 데미지 : %d\n", other.name, this.ATK-other.DEF);
		if(other.HP <= 0) {
			System.out.println("적을 처치했습니다");
		}
	}
	
	void Defend(Unit other) {
		this.HP = this.HP - (other.ATK - this.DEF);
	}
}
