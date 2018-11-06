package ejercicios.Strategy.abstractClases;

import ejercicios.Strategy.interfaces.WeaponBehaviour;

public abstract class Personaje {
	
	protected WeaponBehaviour weapon;
	
	public void setWeapon(WeaponBehaviour we) {
		weapon = we;
	}
	
	public abstract void displayMsj();
	
	public String figth() {
		return weapon.useWeapon();
	}
	
}
