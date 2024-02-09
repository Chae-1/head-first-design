package ch02.v1;

import java.util.List;

public class WeatherData {
    private List<WeatherClient> weatherClients;
    private float temperature;
    private float pressure;
    private float humidity;

    public WeatherData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public void addClient(WeatherClient client) {
        weatherClients.add(client);
    }

    public void removeClient(WeatherClient client) {
        weatherClients.remove(client);
    }

    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        for (WeatherClient weatherClient : weatherClients) {
            weatherClient.update(temperature, pressure, humidity);
        }
    }

}
