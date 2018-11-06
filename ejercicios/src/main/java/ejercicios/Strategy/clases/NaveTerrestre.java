package ejercicios.Strategy.clases;

import ejercicios.Strategy.abstractClases.Nave;
import ejercicios.Strategy.velocidadBehaviour.VelocidadSinMotor;


public class NaveTerrestre extends Nave{
	
	public NaveTerrestre() {
		velocidad = new VelocidadSinMotor();
	}

	@Override
	public void combate() {
		
		
	}

	@Override
	public void informarEstado() {
		// TODO Auto-generated method stub
		
	}
	

	
}
