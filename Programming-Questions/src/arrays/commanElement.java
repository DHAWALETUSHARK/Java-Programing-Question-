package arrays;
import java.util.*;
public class commanElement {

	public static void main(String[] args) {
		
		int arr1[] = {10,20,30,40,50};
		int arr2[] = {40,50,60,70,80};
		commanElement.Comman(arr1, arr2);
		
	}
	
	public static void Comman(int arr1[],int arr2[])
	{
		Set<Integer> set = new HashSet<>();
		Set<Integer> commanElements = new HashSet<>();
		
		for(int i :arr1)
		{
			set.add(i);
		}
		
		for(int i :arr2)
		{
			if(set.contains(i))
			{
				commanElements.add(i);
			}
		}
		
		System.out.println("Comman Element are : "+Arrays.toString(commanElements.toArray()));
	}

}
