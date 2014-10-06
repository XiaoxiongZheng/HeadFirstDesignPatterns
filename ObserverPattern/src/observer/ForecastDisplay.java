package observer;

public class ForecastDisplay implements Observer, DisplayElement{
	private float currentPressure;
	private float lastPressure;
	//private WeatherData weatherData;
	
	public ForecastDisplay(WeatherData weatherData)
	{
		// TODO Auto-generated constructor stub
		currentPressure = 0;
		lastPressure = 0;
		//this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display()
	{
		// TODO Auto-generated method stub
		if (currentPressure > lastPressure)
			System.out.println("Forecast: Improving weather on the way!");
		if (currentPressure == lastPressure)
			System.out.println("Forecast: More of the same");
		if (currentPressure < lastPressure)
			System.out.println("Forecast: Watch out for cooler, rainy weather");
	}

	@Override
	public void update(float temp, float humidity, float pressure)
	{
		// TODO Auto-generated method stub
		lastPressure = currentPressure;
		currentPressure = pressure;
		display();
	}
	
}
