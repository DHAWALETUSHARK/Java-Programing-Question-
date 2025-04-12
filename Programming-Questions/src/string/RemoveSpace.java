package string;
import java.util.*;
public class RemoveSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		String nstr ="";
		System.out.println("Before remove Space String is "+str);
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == ' ')
			{
				continue;
			}
			nstr = nstr+str.charAt(i);
		}
		System.out.println("After remove Space String is "+nstr);
		sc.close();
	}

}
