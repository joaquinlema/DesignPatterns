package ejercicios.Strategy.clases;

import ejercicios.Strategy.WeaponBehaviour.AxeBehaviour;
import ejercicios.Strategy.abstractClases.Personaje;

public class Queen extends Personaje{
	
	public Queen() {
		weapon = new AxeBehaviour();
	}

	@Override
	public void displayMsj() {
		System.out.println("Queen: "+ this.figth());
		
	}
}
