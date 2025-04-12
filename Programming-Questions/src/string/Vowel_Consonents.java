package string;
import java.util.Scanner;
public class Vowel_Consonents {

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter the String : ");
	     String str = sc.nextLine();
	     str = str.toLowerCase();
	     int vowel =0;
	     int cons = 0;
	     
	     for(int i=0;i<str.length();i++)
	     {
	    	 if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'u' || str.charAt(i) == 'o' || str.charAt(i) == 'i')
	    	 {
	    		 vowel++;
	    	 }
	    	 else if(str.charAt(i) == ' ')
	    	 {
	    		 continue;
	    	 }
	    	 else {
	    		 cons++;
	    	 }
	     }
	     
	     System.out.println("Total Vovels are : " + vowel + " , Total Consonents are : " + cons);
	     sc.close();
	}

}
