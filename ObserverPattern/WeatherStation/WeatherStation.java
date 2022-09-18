public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
    
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}

/**
 Output:

    Current conditions: 80.0F degrees and 65.0% humidity
    Avg/Max/Min temperature = 80.0/80.0/80.0
    Forecast: Improving weather on the way!
    Current conditions: 82.0F degrees and 70.0% humidity
    Avg/Max/Min temperature = 81.0/82.0/80.0
    Forecast: Watch out for cooler, rainy weather
    Current conditions: 78.0F degrees and 90.0% humidity
    Avg/Max/Min temperature = 80.0/82.0/78.0
    Forecast: More of the same
    
 */