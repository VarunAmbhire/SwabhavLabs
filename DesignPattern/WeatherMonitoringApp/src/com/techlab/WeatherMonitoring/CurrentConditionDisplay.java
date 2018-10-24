package com.techlab.WeatherMonitoring;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {
	private float temprature;
	private float humidity;
	Observable observable;

	public CurrentConditionDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temprature + "F deggrees and  " + humidity + "% humidity");
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.temprature = weatherData.getTemprature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

}
