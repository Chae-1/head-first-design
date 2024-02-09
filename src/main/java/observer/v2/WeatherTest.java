package observer.v2;

public class WeatherTest {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(10, 10, 10);
        Observer observer1 = new PressureWeatherClient(weatherData);
        Observer observer2 = new TemperatureWeatherClient(weatherData);

        weatherData.registerObserver(observer1);
        weatherData.registerObserver(observer2);

        weatherData.measurementChanges(20, 20, 20);
    }
}
