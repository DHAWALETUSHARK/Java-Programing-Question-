package arrays;

public class MoveZeroInLast {

	public static void main(String[] args) {
		int[] arr = {0, 1, 0, 3, 12};
		int index =0;
		
		for(int num :arr)
		{
			if(num != 0)
			{
				arr[index++] = num;
			}
		}
		
		while(index < arr.length)
		{
			arr[index++] = 0;
		}
		
		for(int i :arr)
		{
			System.out.print(i+" ");
		}

	}

}
