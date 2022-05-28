package com.vimal.exercises.ch.two.observer.weather.displays;

import com.vimal.exercises.ch.two.observer.weather.DisplayElement;
import com.vimal.exercises.ch.two.observer.weather.Observer;
import com.vimal.exercises.ch.two.observer.weather.WeatherData;

public class ScrambledForecastDiscplay implements Observer, DisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ScrambledForecastDiscplay(final WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.print("Scrambled Forecast Exercise Display: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    @Override
    public void update() {
        this.lastPressure = this.currentPressure;
        this.currentPressure = weatherData.getPressure();;
        display();
    }
}
