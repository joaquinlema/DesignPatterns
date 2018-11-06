package ejercicios.Strategy.clases;

import ejercicios.Strategy.abstractClases.Nave;
import ejercicios.Strategy.velocidadBehaviour.VelocidadConMotor;



public class NaveEspacial extends Nave{
	
	public NaveEspacial() {
		velocidad = new VelocidadConMotor();
	}

	@Override
	public void combate() {
		
		
	}

	@Override
	public void informarEstado() {
		// TODO Auto-generated method stub
		
	}
	

	
}
