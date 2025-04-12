package searching;

public class BinarySearch {
	
	public static int BinarySearching(int arr[],int key)
	{
		int si =0,ei = arr.length-1;
		
		while(si <= ei)
		{
			int mid = si +(ei-si)/2;
			
			if(arr[mid] == key)
			{
				return mid;
			}
			
			if(arr[mid] < key)
			{
				si = mid+1;
			}
			else {
				ei = mid -1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {3,5,2,5,6,7,8,1};
		int key = 7;
		
        int result = BinarySearch.BinarySearching(arr, key);
		
		if(result != -1)
		{
			System.out.println(key +" is found in index "+result);
		}
		else {
			System.out.println(key+" is Not Found!!!");
		}
	}

}
