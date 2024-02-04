package ch02;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        currentConditionsDisplay.display();

        weatherData.setMeasurements(10, 10, 10);
    }
}
