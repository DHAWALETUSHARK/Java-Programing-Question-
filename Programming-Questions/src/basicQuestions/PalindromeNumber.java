package basicQuestions;

public class PalindromeNumber {
	
	public static boolean isPrime(int num)
	{
		int rev =0;
		int original = num;
		
		if(num == 0) return true;
		
		while(num >0)
		{
			int digit = num % 10;
			rev = 10 * rev +digit;
			num = num /10;
		}
		if(original == rev) return true;
		
		return false;
	}

	public static void main(String[] args) {
		int num =1011;
		boolean result = PalindromeNumber.isPrime(num);
		if(result)
		{
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is Not Palindrome");
		}
	}

}
