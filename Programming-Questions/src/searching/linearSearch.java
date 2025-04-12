package searching;

public class linearSearch {
	
	public static int LinearSearching(int arr[],int key)
	{
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == key)
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {3,5,2,5,6,7,8,1};
		int key = 7;
		int result = linearSearch.LinearSearching(arr, key);
		
		if(result != -1)
		{
			System.out.println(key +" is found in index "+result);
		}
		else {
			System.out.println(key+" is Not Found!!!");
		}
	}

}
