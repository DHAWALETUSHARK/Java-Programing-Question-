package collections;

import java.util.*;
public class LinkedListExample {

	public static void main(String[] args) 
	{
		LinkedList<String> list = new LinkedList<>();
		
		list.add("Apple");
		list.add("Mango");
		list.add("Banana");
		
		list.addFirst("A");
		list.addLast("Z");
		
		list.removeFirst();
		list.removeLast();
		
		for(String item :list)
		{
			System.out.println(item);
		}
		
	}

}
