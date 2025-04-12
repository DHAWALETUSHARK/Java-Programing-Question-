package arrays;

import java.util.HashSet;

public class DuplicateNumber {

	public static void main(String[] args) {
		int[] arr = {1, 3, 2, 3, 4, 1};
		HashSet<Integer> seen = new HashSet<>();
		
		System.out.println("Duplicate value");
		for(int num :arr)
		{
			if(!seen.add(num))
			{
				System.out.print(num+" ");
			}
		}
	}

}
