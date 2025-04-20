package arrays;

import java.util.Arrays;

public class AddTwoDigitArray {
	
	public static int convertArrayToNumber(int arr[])
	{
		int num =0;
		for(int digit :arr)
		{
			num = num * 10 + digit;
		}
		
		return num;
	}
	
	public static int[] convertNumberToArray(int number)
	{
		String str = Integer.toString(number);
		int[] result = new int[str.length()];
		
		for(int i =0;i<str.length();i++)
		{
			result[i] = str.charAt(i)-'0';
		}
		
		return result;
	}
	

	public static void main(String[] args) {
		int arr1[] = {1,2,3};
		int arr2[] = {3,4,5,6};
		
		int num1 =convertArrayToNumber(arr1);
		int num2 =convertArrayToNumber(arr2);
		
		int sum = num1+num2;
		
		int[] result = convertNumberToArray(sum);
		System.out.println("Result Array : "+Arrays.toString(result));
		
	}

}
