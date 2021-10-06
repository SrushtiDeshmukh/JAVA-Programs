//Program to copy all elements of one array into another array
import java.util.Arrays;
class Program7
{
	public static void main(String args[])
	{
		int arr[]=new int[]{5,6,7,8,9,10};
		int arr2[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			arr2[i]=arr[i];
		}
		
		System.out.println("New array is ");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		System.out.print(Arrays.toString(arr));		//to print array elements in single line in java
	}
}


