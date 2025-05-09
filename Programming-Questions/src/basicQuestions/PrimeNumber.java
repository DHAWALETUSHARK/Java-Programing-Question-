package basicQuestions;

public class PrimeNumber {
	
	public static void PrintPrime(int n)
	{
		int count =0;
		int num =2;
		while(count < n)
		{
			if(isPrime(num))
			{
				System.out.print(num+"--");
				count++;
			}
			num++;
		}
	}
	
	public static boolean isPrime(int n)
	{
		if(n < 2)
		{
			return false;
		}
		
		for(int i=2;i*i <=n;i++)
		{
			if(n % i == 0)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		PrimeNumber.PrintPrime(5);
	}

}
