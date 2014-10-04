package DuckExample;

public class MallardDuck extends Duck {
	
	public MallardDuck()
	{
		// TODO Auto-generated constructor stub
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	public void display()
	{
		// TODO Auto-generated method stub
		System.out.println("I'm a real Mallar duck");
	}
	
}
