package ch02.v2;

public class TemperatureWeatherClient implements Observer {
    private WeatherData weatherData;
    private float temperature;

    public TemperatureWeatherClient(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    public void join() {
        weatherData.registerObserver(this);
    }

    public void out() {
        weatherData.removeObserver(this);
    }

    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        showData();
    }

    public void showData() {
        System.out.println("temperature : "+ temperature + " ");
    }
}
