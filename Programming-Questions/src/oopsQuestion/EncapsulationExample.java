package oopsQuestion;

class Person{
	private String name;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
}

public class EncapsulationExample
{

	public static void main(String[] args)
	{
		Person p = new Person();
		p.setName("Tushar");
		System.out.println(p.getName());
	}

}
