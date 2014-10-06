package observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
	private float temperature;
	private float humidity;
	//private Subject weatherData;
	
	public CurrentConditionsDisplay(WeatherData weatherData)
	{
		// TODO Auto-generated constructor stub
		//this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display()
	{
		// TODO Auto-generated method stub
		System.out.println("Current conditions: "+temperature+"F degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(float temp, float humidity, float pressure)
	{
		// TODO Auto-generated method stub
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}
	
}






















