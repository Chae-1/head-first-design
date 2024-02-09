package observer.v2;

public class PressureWeatherClient implements Observer {
    private final WeatherData weatherData;
    private float pressure;

    public PressureWeatherClient(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    public void showData() {
        System.out.println("pressure : "+ pressure + " ");
    }


    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.pressure = pressure;
        showData();
    }
}
