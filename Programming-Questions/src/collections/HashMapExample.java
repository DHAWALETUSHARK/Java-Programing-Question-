package collections;
import java.util.*;
public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<>();
		
		map.put(1, "Tushar");
		map.put(2, "Dhawale");
		map.put(3, "Rushi");
		map.put(0, "Rushi");
		map.put(1, "Tushar1");
		
		map.put(1, "Tushar");
		map.remove(3,"Rushi");
		
		System.out.println(map.size());
		for(Map.Entry<Integer,String> entry :map.entrySet())
		{
			System.out.println(entry.getKey()+" => "+entry.getValue());
		}
		
		System.out.println(map);

	}

}
