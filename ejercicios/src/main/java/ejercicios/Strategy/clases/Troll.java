package ejercicios.Strategy.clases;

import ejercicios.Strategy.WeaponBehaviour.KnifeBehaviour;
import ejercicios.Strategy.abstractClases.Personaje;

public class Troll extends Personaje{

	public Troll() {
		weapon = new KnifeBehaviour();
	}

	@Override
	public void displayMsj() {
		System.out.println("Troll: "+ this.figth());
		
	}
	
}
