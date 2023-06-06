package createClass;

public class Malphite extends Unit {

	Malphite(String name, double HP, double ATK, double DEF) {
		super(name, HP, ATK, DEF);
		// TODO Auto-generated constructor stub
	}

	void Q(Unit other) { // 인게임 Q
		double Qdamage = 270 + this.getATK() * 0.6;
		System.out.printf("%s가 Q사용\n", this.getName());
		System.out.printf("%s가 %s에게 가한 데미지 : %.2f\n", this.getName(), other.getName(), Qdamage);
		double otherHP = other.getHP();
		otherHP -= Qdamage;
		other.setHP(otherHP);
	}

	void W(Unit other) { // 인게임 W
		double Wdamage = 70 + this.getATK() * 0.2 + this.getDEF() * 0.15;
		System.out.printf("%s가 W사용\n", this.getName());
		System.out.printf("%s가 %s에게 가한 데미지 : %.2f\n", this.getName(), other.getName(), Wdamage);
		double otherHP = other.getHP();
		otherHP -= Wdamage;
		other.setHP(otherHP);
	}

	void E(Unit other) { // 인게임 E
		double Edamage = 230 + this.getATK() * 0.6 + this.getDEF() * 0.4;
		System.out.printf("%s가 E사용\n", this.getName());
		System.out.printf("%s가 %s에게 가한 데미지 : %.2f\n", this.getName(), other.getName(), Edamage);
		double otherHP = other.getHP();
		otherHP -= Edamage;
		other.setHP(otherHP);
	}
}
