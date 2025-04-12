package oopsQuestion;

class Calculator{
	int add(int a,int b)
	{
		return a+b;
	}
	
	double add(double a,double b)
	{
		return a+b;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		System.out.println("Addition of Two integer:"+c.add(5, 3));
		System.out.println("Addition of Two Double:"+c.add(3.5, 5.0));
	}

}
