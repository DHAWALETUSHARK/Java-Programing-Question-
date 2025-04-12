package collections;
import java.util.*;
public class HashSetExample {

	public static void main(String[] args) {
		
		 HashSet<String> set = new HashSet<>();
		 
	     set.add("Java");
	     set.add("Python");
	     set.add("C++");
	     
	     set.add("Java"); // duplicate won't be added
	     
	  // Since Set doesn't support direct update, simulate by removing and adding
	     	if(set.contains("C++"))
	     	{
	    	    set.remove("C++");
	    	    set.add("C#");  // Update C++ to C#
	     	}
	     	
	     // Remove specific element
	     	set.remove("Python");
	     	
	     for(String lang :set)
	     {
	    	 System.out.println(lang);
	     }
	}

}
