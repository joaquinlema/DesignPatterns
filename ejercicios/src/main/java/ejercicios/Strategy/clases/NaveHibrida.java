package ejercicios.Strategy.clases;

import ejercicios.Strategy.abstractClases.Nave;
import ejercicios.Strategy.velocidadBehaviour.VelocidadHibrida;


public class NaveHibrida extends Nave{
	
	public NaveHibrida() {
		velocidad = new VelocidadHibrida();
	}

	@Override
	public void combate() {
		
		
	}

	@Override
	public void informarEstado() {
		// TODO Auto-generated method stub
		
	}
	

	
}
