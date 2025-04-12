package basicQuestions;

public class Factorial {
	
	public static void Fact(int n)
	{
		int count = 1;
		for(int i=1;i<=n;i++)
		{
			count = count * i;
		}
		System.out.println("Factorial is : "+count );
	}

	public static void main(String[] args) {
		Factorial.Fact(5);
	}

}
