package basicQuestions;

public class FibonacciSeries {

	// Without Recursion
	public static void PrintFibo(int n)
	{
		int first =0;int second =1;
		System.out.print("Fibonacci Series "+first+" "+second);
		for(int i=2;i<n;i++)
		{
			int next = first + second;
			System.out.print(" "+next);
			first = second;
			second = next;
		}
	}
	
	//With Recursion
	public static int PrintFibpRec(int n)
	{
		if(n <= 1)
		{
			return n;
		}
		
		return PrintFibpRec(n-1) + PrintFibpRec(n-2);
	}
	
	public static void main(String[] args) {
		FibonacciSeries.PrintFibo(5);

		System.out.println();
		
		for(int i=0;i<5;i++)
		{
			System.out.print(FibonacciSeries.PrintFibpRec(i)+" ");
		}
	}

}
