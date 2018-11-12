package ejercicios.Observer.clases.observers;

import java.util.Observable;
import java.util.Observer;

import ejercicios.Observer.clases.observable.WeatherData;
import ejercicios.Observer.interfaces.Display;

public class CurrentConditionsDisplay implements Observer,Display{
	
	Observable observable;
	private float temperature;
	private float humidity;
	
	public CurrentConditionsDisplay(Observable o) {
		this.observable = o; //especifico quien es mi subject o a quien me suscribo
		o.addObserver(this);//me agrego a la suscripcion del subject o observable
	}
	
	public void update(Observable arg0, Object arg1) {//recibe el observable y un parametro opcional con algun dato
		if (arg0 instanceof WeatherData) {//verifico que sea el tipo que necesito o mi subject
			WeatherData weatherData = (WeatherData)arg0;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

	public void display() {
		System.out.println("Humedad: "+this.humidity+" , Temperatura: "+this.temperature);
	}
}
