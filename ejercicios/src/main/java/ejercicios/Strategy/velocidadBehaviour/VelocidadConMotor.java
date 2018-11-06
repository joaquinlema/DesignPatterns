package ejercicios.Strategy.velocidadBehaviour;

import ejercicios.Strategy.interfaces.VelocidadBehaviour;

public class VelocidadConMotor implements VelocidadBehaviour{

	public void getVelocidad() {
		System.out.println("volando con motor, velocidad 100mps");
	}

}
