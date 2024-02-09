package ch02.v1;

public class WeatherClient {
    private WeatherData weatherData;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherClient(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    public void join() {
        weatherData.addClient(this);
    }

    public void out() {
        weatherData.removeClient(this);
    }

    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        showData();
    }

    public void showData() {
        System.out.println(temperature + " " + pressure + " " + humidity);
    }
}
