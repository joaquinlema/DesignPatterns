package ejercicios.Strategy.velocidadBehaviour;

import ejercicios.Strategy.interfaces.VelocidadBehaviour;

public class VelocidadHibrida implements VelocidadBehaviour{

	VelocidadConMotor vmotor;
	VelocidadSinMotor smotor;
	
	public VelocidadHibrida() {
		vmotor = new VelocidadConMotor();
		smotor = new VelocidadSinMotor();
	}
	
	public void getVelocidad() {
		System.out.println("Velocidad Hibrida: ");
		vmotor.getVelocidad();
		smotor.getVelocidad();
	}

}
