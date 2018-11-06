package ejercicios.Strategy.velocidadBehaviour;

import ejercicios.Strategy.interfaces.VelocidadBehaviour;

public class VelocidadSinMotor implements VelocidadBehaviour{

	public void getVelocidad() {
		System.out.println("volando sin motor, velocidad 80mps");
	}

}
