//java Program to remove duplicate element in an Array
import java.util.*;
class Program15
{
	static int removeDuplicateElements(int arr[])
	{
		int temp=0;
		int uniqarr[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("Sorted array ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		int j=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				uniqarr[j]=arr[i];
				j++;
			}
		}
		uniqarr[j++]=arr[arr.length-1];
		System.out.println();
		
		
		for(int i=0;i<j;i++)
		{
			arr[i]=uniqarr[i];
		}
		return j;
	}
	
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		int arr[]=new int[8];
		System.out.println("Enter elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sobj.nextInt();
		}
		
		int j=removeDuplicateElements(arr);
		
		System.out.print("Unique array ");
		for(int i=0;i<j;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
