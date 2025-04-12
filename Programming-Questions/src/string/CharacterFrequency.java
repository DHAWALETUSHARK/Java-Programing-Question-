package string;
import java.util.*;

public class CharacterFrequency 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String input = sc.nextLine();
		
		HashMap<Character,Integer> frequecymap = new HashMap<>();
		
		for(char ch :input.toCharArray())
		{
			if(ch != ' ')
			{
				frequecymap.put(ch, frequecymap.getOrDefault(ch, 0)+1);
			}
		}
		
		for(char key :frequecymap.keySet())
		{
			System.out.println(key+" = "+frequecymap.get(key));
		}
		
		sc.close();
	}

}
