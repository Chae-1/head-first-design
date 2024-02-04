package ch02;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observers;
    private float pressure;
    private float humidity;
    private float temperature;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void measurementChanges() {
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.pressure = pressure;
        this.temperature = temp;
        this.humidity = humidity;
        measurementChanges();
    }
}
