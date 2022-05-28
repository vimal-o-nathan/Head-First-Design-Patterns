package com.vimal.exercises.ch.two.observer.weather.displays;

import com.vimal.exercises.ch.two.observer.weather.DisplayElement;
import com.vimal.exercises.ch.two.observer.weather.Observer;
import com.vimal.exercises.ch.two.observer.weather.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(final WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = this.weatherData.getTemperature();
        this.humidity = this.weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
