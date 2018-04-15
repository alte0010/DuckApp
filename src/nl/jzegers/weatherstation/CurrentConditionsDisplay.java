package nl.jzegers.weatherstation;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float humidity;
    private float pressure;
    private float temperature;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float humidity, float pressure, float temperature) {
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + " degrees C and " +
                                                    humidity + "% humidity and " +
                                                    pressure + " kPa pressure");
    }
}
