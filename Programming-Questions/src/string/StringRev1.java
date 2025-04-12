package string;
import java.util.*;
public class StringRev1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		String nstr ="";
		System.out.println("Original String is "+str);
		for(int i=0;i<str.length();i++)
		{
			nstr =str.charAt(i) + nstr;
		}
		System.out.println("Reversed String is "+nstr);
		sc.close();
	}

}
