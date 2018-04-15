package nl.jzegers.weatherstation;

public class WeatherStation {

    public static void main(String[] args) {
	    WeatherData weatherData = new WeatherData();

	    CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
        // ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
	    // StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(75, 100, 15);
        weatherData.setMeasurements(80, 90, 10);
        weatherData.setMeasurements(70, 105, 20);

        currentConditions.display();
    }
}
