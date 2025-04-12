package string;

public class ReverseRec {
	
	public static String reverse(String str)
	{
		if(str.isEmpty() || str.length() == 1)
		{
			return str;
		}
		
		return reverse(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {
		String str ="Tushar";
		System.out.println("Revers String is : "+reverse(str));
	}

}
