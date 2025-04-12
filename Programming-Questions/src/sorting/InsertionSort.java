package sorting;

public class InsertionSort {
	
	public static void InsertionSorting(int arr[])
	{
		int n = arr.length;
		for(int i =1;i<n;i++)
		{
			int curr = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]>curr)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = curr;
		}
	}

	public static void main(String[] args) {
		int arr[] = {20,10,50,40,60,30};
		InsertionSort.InsertionSorting(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
