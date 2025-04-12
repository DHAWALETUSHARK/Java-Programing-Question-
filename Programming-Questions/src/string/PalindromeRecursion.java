package string;

public class PalindromeRecursion {
	
	public static boolean isPalindrome(String str,int left,int right)
	{
		if(left >= right)
		{
			return true;
		}
		
		if(str.charAt(left) != str.charAt(right))
		{
			return false;
		}
		
		return isPalindrome(str,left+1,right-1);
	}

	public static void main(String[] args) {
		String str ="madamm";
		
		if(isPalindrome(str,0,str.length()-1))
		{
			System.out.println("String is Palindroome");
		}
		else {
			System.out.println("String is Not Palindrome");
		}
	}

}
