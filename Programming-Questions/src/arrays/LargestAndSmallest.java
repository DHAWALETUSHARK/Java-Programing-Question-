package arrays;

public class LargestAndSmallest {

	public static void main(String[] args) {
	
		int arr[] = {10,20,30,40,50};
		LargestAndSmallest.Largest_smallest(arr);
	}
	
	public static void Largest_smallest(int arr[])
	{
		int largest = arr[0];
		int smallest = arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] >= largest) largest =arr[i];
			
			if(arr[i] <= smallest) smallest = arr[i];
			
		}
		System.out.println("Largest element is : "+largest +"\nSmallest Number is "+smallest);
		
	}

}
