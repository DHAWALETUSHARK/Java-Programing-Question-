package arrays;

public class FindSecondLargest {

	public static void main(String[] args) 
	{
		int arr[] = {10,30,50,20,40,60,70};
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int num :arr)
		{
			if(num > largest)
			{
				secondLargest = largest;
				largest = num;
			}
			else if(num > secondLargest && num != largest)
			{
				secondLargest = num;
			}
		}
		System.out.println("Largest Element : "+largest);
		System.out.println("Second Largest Elemnt : "+secondLargest);
	}

}
