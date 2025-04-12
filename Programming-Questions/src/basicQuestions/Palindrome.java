package basicQuestions;

public class Palindrome {
	
	public static boolean isPalindrome(String str)
	{
		int n = str.length();
		for(int i=0;i<n/2;i++)
		{
			if(str.charAt(i) != str.charAt(n-i-1))
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str ="madam";
		boolean result = Palindrome.isPalindrome(str);
		
		if(result)
		{
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is Not Palindrome");
		}
	}

}
