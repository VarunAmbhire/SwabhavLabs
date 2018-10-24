package com.techlab.WeatherMonitoringTest;

import com.techlab.WeatherMonitoring.CurrentConditionDisplay;
import com.techlab.WeatherMonitoring.WeatherData;

public class WeatherMonitoringTest {

	public static void main(String[] args) {

		WeatherData weatherData=new WeatherData();
		
		CurrentConditionDisplay currentConditionDisplay=new CurrentConditionDisplay(weatherData);
		
		weatherData.setMeasurements(23, 89, 45);
		weatherData.setMeasurements(24, 92, 40);
		weatherData.setMeasurements(29, 98, 25);

	}

}
