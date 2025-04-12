package collections;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Apple");
		list.add("Mango");
		list.add("Banana");
		
		list.remove(1);
		
		list.add(1, "Mango");
		
		for(String fruit :list)
		{
			System.out.println(fruit);
		}
		
	}

}
