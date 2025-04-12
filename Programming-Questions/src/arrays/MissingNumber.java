package arrays;

public class MissingNumber {
	
	

	public static void main(String[] args) {
		int arr[] = {1,2,4,5,6,7};	
		int n = arr.length +1;
		
		int totalsum = n *(n+1)/2;
		int arraysum =0;
		
		for(int i :arr)
		{
			arraysum = arraysum+i;
		}
		
		int missing = totalsum -arraysum;
		System.out.println("Missing number is "+missing);
	}

}
