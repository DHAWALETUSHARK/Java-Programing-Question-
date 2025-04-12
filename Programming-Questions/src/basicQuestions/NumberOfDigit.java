package basicQuestions;

public class NumberOfDigit {
	
	public static int DigitOfNumber(int n)
	{
		if(n < 10 && n >=0 ) return 1;
		
		if(n < 0) n = n* -1;
		int count =1;
		while(n>=10)
		{
			count++;
			n = n/10;
		}
		return count;
	}

	public static void main(String[] args) {
		int count = NumberOfDigit.DigitOfNumber(-12);
		System.out.println("Number of Count is "+count);

	}

}
