package com.vimal.exercises.ch.two.observer.weather.displays;

import com.vimal.exercises.ch.two.observer.weather.DisplayElement;
import com.vimal.exercises.ch.two.observer.weather.Observer;
import com.vimal.exercises.ch.two.observer.weather.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        float temp = this.weatherData.getTemperature();
        tempSum += temp;
        numReadings++;

        if (temp > maxTemp) {
            maxTemp = temp;
        }

        if (temp < minTemp) {
            minTemp = temp;
        }

        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                           + "/" + maxTemp + "/" + minTemp);
    }
}
