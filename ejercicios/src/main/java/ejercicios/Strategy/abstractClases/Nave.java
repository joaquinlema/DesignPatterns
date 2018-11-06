package ejercicios.Strategy.abstractClases;

import ejercicios.Strategy.interfaces.VelocidadBehaviour;

public abstract class Nave {

	protected VelocidadBehaviour velocidad;
	
	public abstract void combate();
	
	public abstract void informarEstado();
	
	public void velocidad() {
		velocidad.getVelocidad();
	}
	
}
