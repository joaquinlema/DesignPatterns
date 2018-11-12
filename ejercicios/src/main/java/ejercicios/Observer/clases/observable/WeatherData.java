package ejercicios.Observer.clases.observable;

import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable {

	public float humidity;
	public float temperature;
	public float pressure;
	
	public WeatherData() {}
	
	public void measurementChanged() {
		setChanged();
		notifyObservers();//usando pull sin pasar datos como parametro
	}
	
	public void setMeasurement(float hum,float temp,float press) {
		this.humidity = hum;
		this.temperature = temp;
		this.pressure = press;
		measurementChanged();
	}

	public float getHumidity() {
		return humidity;
	}

	public float getTemperature() {
		return temperature;
	}

	public float getPressure() {
		return pressure;
	}
	
	
}
