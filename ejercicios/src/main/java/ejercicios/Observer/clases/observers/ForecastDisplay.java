package ejercicios.Observer.clases.observers;

import java.util.Observable;
import java.util.Observer;

import ejercicios.Observer.clases.observable.WeatherData;
import ejercicios.Observer.interfaces.Display;

public class ForecastDisplay implements Observer,Display{
	
	Observable observable;
	private float currentPressure = 29.92f;
	private float lastPressure;
	
	public ForecastDisplay(Observable o) {
		this.observable = o; //especifico quien es mi subject o a quien me suscribo
		o.addObserver(this);//me agrego a la suscripcion del subject o observable
	}
	
	public void update(Observable arg0, Object arg1) {//recibe el observable y un parametro opcional con algun dato
		if (arg0 instanceof WeatherData) {//verifico que sea el tipo que necesito o mi subject
			WeatherData weatherData = (WeatherData)arg0;
			lastPressure = currentPressure;
			currentPressure = weatherData.getPressure();
			display();
		}
	}

	public void display() {
		System.out.println("Presion actual: "+this.currentPressure+" , Presion ultima registrada: "+this.lastPressure);
	}
}
