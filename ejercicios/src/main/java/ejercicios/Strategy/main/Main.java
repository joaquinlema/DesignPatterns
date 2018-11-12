package ejercicios.Strategy.main;

import ejercicios.Strategy.WeaponBehaviour.AxeBehaviour;
import ejercicios.Strategy.WeaponBehaviour.KnifeBehaviour;
import ejercicios.Strategy.abstractClases.Duck;
import ejercicios.Strategy.abstractClases.Personaje;
import ejercicios.Strategy.clases.DuckType3;
import ejercicios.Strategy.clases.King;
import ejercicios.Strategy.clases.Queen;
import ejercicios.Strategy.flyBehaviour.FlyWithRocket;

public class Main {

	public static void main(String[] args) {

		Duck tipo3 = new DuckType3();
		tipo3.performFly();
		tipo3.performQuack();
		tipo3.setFlyBehaviour(new FlyWithRocket());
		tipo3.performFly();
		
		Personaje king = new King();
		king.displayMsj();
		king.setWeapon(new AxeBehaviour());
		king.displayMsj();
	
		Personaje queen = new Queen();
		queen.displayMsj();
		queen.setWeapon(new KnifeBehaviour());
		queen.displayMsj();
		
	}
}
