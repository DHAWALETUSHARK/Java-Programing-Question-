package sorting;

public class SelectionSort {
	
	public static void InsertionSorting(int arr[])
	{
		int n =arr.length;
		
		for(int i=0;i<n-1;i++)
		{
			int minIdx = i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[minIdx] > arr[j])
				{
					minIdx = j;
				}
			}
			int temp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = temp;
		}
	}
	
	
	public static void main(String[] args) {
		int arr[] = {20,10,50,40,60,30};
		SelectionSort.InsertionSorting(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
