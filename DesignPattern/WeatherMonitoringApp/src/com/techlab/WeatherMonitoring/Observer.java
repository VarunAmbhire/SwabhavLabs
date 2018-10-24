package com.techlab.WeatherMonitoring;

public interface Observer {

	public void update(float temp, float humidity, float pressure);
}
