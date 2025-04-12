package oopsQuestion;

class Animal{
	void sound()
	{
		System.out.println("Animal Make a Sound");
	}
}

class Dog extends Animal{
	void sound()
	{
		System.out.println("Dog barks") ;
	}
}	


public class InheritanceExample 
{
	public static void main(String[] args)
	{
		Animal a  = new Animal();
		a.sound();
		
		Animal a1  = new Dog();
		a1.sound();
	}
}
