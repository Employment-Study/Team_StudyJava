package starcraft.units.protoss;

import starcraft.units.Damage_Type;
import starcraft.units.UnitType;

public class Zealot extends ProtossUnit{
	public Zealot(String name) {
		this.setAttack(16);
		this.setSpeed(1.875);
		this.setArmor(1);
		this.setName(name);
		this.setHp(100);
		this.setShield(60);
		this.setShield_regeneration(1);
		this.setPeople(2);
		this.setUnitType(UnitType.Small);
		this.setDamage_type(Damage_Type.Normal);
	}
}
