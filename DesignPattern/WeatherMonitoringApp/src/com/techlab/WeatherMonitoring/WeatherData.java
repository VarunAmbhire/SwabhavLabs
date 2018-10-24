package com.techlab.WeatherMonitoring;

import java.util.Observable;

public class WeatherData extends Observable {
	private float temprature;
	private float humidity;
	private float pressure;

	public WeatherData() {
	}

	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}

	public void setMeasurements(float temprature, float humidity, float pressure) {
		this.temprature = temprature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemprature() {
		return temprature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

}
