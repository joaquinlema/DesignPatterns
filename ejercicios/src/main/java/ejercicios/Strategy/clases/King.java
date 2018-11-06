package ejercicios.Strategy.clases;

import ejercicios.Strategy.WeaponBehaviour.SwordBehaviour;
import ejercicios.Strategy.abstractClases.Personaje;

public class King extends Personaje{

	public King() {
		weapon = new SwordBehaviour();
	}

	@Override
	public void displayMsj() {
		System.out.println("King: " + this.figth());
	}
	
}
