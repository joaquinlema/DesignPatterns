package ejercicios.Strategy.clases;

import ejercicios.Strategy.abstractClases.Duck;
import ejercicios.Strategy.flyBehaviour.FlyWithWings;
import ejercicios.Strategy.quackBehaviour.Quack;

public class DuckType1 extends Duck{
	
	public DuckType1() {
		flyBehaviour = new FlyWithWings();
		quackBehaviour = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("Soy type1");
		
	}

	
}
