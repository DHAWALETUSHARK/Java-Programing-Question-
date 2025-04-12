package oopsQuestion;

interface AnimalAction{
	void makeSound();
}

class Animal1 implements AnimalAction {
	private String name;
	
	public Animal1(String name)
	{
		this.name = name;
	}
	
	public String getname()
	{
		return name;
	}
	
	public void makeSound()
	{
		System.out.println("Animal makes a Sound");
	}
	
	public void sleep()
	{
		System.out.println(name+" is Sleeping");
	}
	
	public void sleep(int hours)
	{
		System.out.println(name+" sleeps for "+hours+" hours");
	}
}

class Dog1 extends Animal1{
	public Dog1(String name)
	{
		super(name);
	}
	
	public void makeSound()
	{
		 System.out.println(getname() + " says: Woof Woof!");	
	}
}

public class AllOppsExample {

	public static void main(String[] args)
	{
		Dog1 d = new Dog1("Tommy");
		
		 d.makeSound();
		 d.sleep();
		 d.sleep(8);
	}

}
