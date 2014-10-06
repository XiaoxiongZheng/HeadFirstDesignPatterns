package observer;

public class StatisticsDisplay implements Observer, DisplayElement{
	private float maxDegree;
	private float meanDegree;
	private float minDegree;
	private float totalDegree;
	private int count;
	private WeatherData weatherData;
	
	public StatisticsDisplay(WeatherData weatherData)
	{
		// TODO Auto-generated constructor stub
		
		maxDegree = Float.MIN_VALUE;
		meanDegree = 0;
		minDegree = Float.MAX_VALUE;
		totalDegree = 0;
		count = 0;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display()
	{
		// TODO Auto-generated method stub
		System.out.println("Avg/Max/Min temperature = " + meanDegree + "/" + maxDegree + "/" + minDegree);
	}

	@Override
	public void update(float temp, float humidity, float pressure)
	{
		// TODO Auto-generated method stub
		if(temp < minDegree)
			minDegree = temp;
		if(temp > maxDegree)
			maxDegree = temp;
		count++;
        totalDegree += temp;
		meanDegree = totalDegree/count;
		display();
	}
	
}
