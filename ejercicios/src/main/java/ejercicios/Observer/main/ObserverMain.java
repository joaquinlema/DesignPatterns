package ejercicios.Observer.main;

import ejercicios.Observer.clases.observable.WeatherData;
import ejercicios.Observer.clases.observers.CurrentConditionsDisplay;
import ejercicios.Observer.clases.observers.ForecastDisplay;

public class ObserverMain {

	public static void main(String[] args) {
		WeatherData weather = new WeatherData();
		CurrentConditionsDisplay current = new CurrentConditionsDisplay(weather);
		ForecastDisplay forecast = new ForecastDisplay(weather);
		
		current.display();
		forecast.display();
		weather.setMeasurement(12.3f, 12.3f, 12.3f);

	}

}
