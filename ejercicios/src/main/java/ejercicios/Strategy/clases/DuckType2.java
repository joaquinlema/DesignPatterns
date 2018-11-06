package ejercicios.Strategy.clases;

import ejercicios.Strategy.abstractClases.Duck;
import ejercicios.Strategy.flyBehaviour.FlyWithNoWings;
import ejercicios.Strategy.quackBehaviour.Tuack;

public class DuckType2 extends Duck{

	public DuckType2() {
		flyBehaviour = new FlyWithNoWings();
		quackBehaviour = new Tuack();
	}
	
	@Override
	public void display() {
		System.out.println("Soy type2");
		
	}

}
