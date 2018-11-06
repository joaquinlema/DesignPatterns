package ejercicios.Strategy.abstractClases;

import ejercicios.Strategy.interfaces.flyBehaviour;
import ejercicios.Strategy.interfaces.quackBehaviour;

public abstract class Duck {
	
	protected flyBehaviour flyBehaviour;
	protected quackBehaviour quackBehaviour;
	
	protected abstract void display();
	
	public void performFly() {
		flyBehaviour.fly();
	}
	
	public void performQuack() {
		quackBehaviour.quack();
	}
	
	public void swin() {
		System.out.println("All Ducks swing :) ");
	}
	
	public void setFlyBehaviour(flyBehaviour fb) {
		flyBehaviour = fb;
	}
	
	public void setQuackBehaviour(quackBehaviour qk) {
		quackBehaviour = qk;
	}
}
