package oopsQuestion;

interface vehical{
	void start();
}

class Car implements vehical{
	public void start()
	{
		System.out.println("Car start with Key");
	}
}

public class Abstraction
{

	public static void main(String[] args)
	{
		vehical v = new Car();
		v.start();
	}

}
