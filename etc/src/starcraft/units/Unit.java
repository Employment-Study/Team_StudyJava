package starcraft.units;

public class Unit {
	private String name;
	private int people;	 // 인구수
	private int hp;		 // 체력
//	private int shield;	 // 프로토스 실드
//	private int regeneration;		// 저그 체력 재생
	private int mana;	 // 마나
	private int attack;	 // 공격력
	private int armor;	 // 방어력
	private double speed; 	// 이동 속도
	private double attack_speed;	// 공격속도
	private boolean ground_attack;	// 지상 공격 가능
	private boolean air_attack;		// 공중 공격 가능
	private boolean can_attack;		// 공격가능
	private boolean can_digging;	// 일꾼?
	private Damage_Type damage_type;	// 데미지 타입
	private UnitType unitType;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPeople() {
		return people;
	}
	public void setPeople(int people) {
		this.people = people;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getArmor() {
		return armor;
	}
	public void setArmor(int armor) {
		this.armor = armor;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getAttack_speed() {
		return attack_speed;
	}
	public void setAttack_speed(double attack_speed) {
		this.attack_speed = attack_speed;
	}
	public boolean isGround_attack() {
		return ground_attack;
	}
	public void setGround_attack(boolean ground_attack) {
		this.ground_attack = ground_attack;
	}
	public boolean isAir_attack() {
		return air_attack;
	}
	public void setAir_attack(boolean air_attack) {
		this.air_attack = air_attack;
	}
	public boolean isCan_attack() {
		return can_attack;
	}
	public void setCan_attack(boolean can_attack) {
		this.can_attack = can_attack;
	}
	public boolean isCan_digging() {
		return can_digging;
	}
	public void setCan_digging(boolean can_digging) {
		this.can_digging = can_digging;
	}
	public Damage_Type getDamage_type() {
		return damage_type;
	}
	public void setDamage_type(Damage_Type damage_type) {
		this.damage_type = damage_type;
	}
	public UnitType getUnitType() {
		return unitType;
	}
	public void setUnitType(UnitType unitType) {
		this.unitType = unitType;
	}
	
	
}
