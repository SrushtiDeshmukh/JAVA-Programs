//java Program to find Third Largest Number in an Array
import java.util.*;
class Program14
{
	public static void main(String args[])
	{
		int arr[]=new int[8];
		int temp=0;
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the elements");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sobj.nextInt();
		}
		
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
		
		System.out.println("Third largest is "+arr[arr.length-3]);
	}
}
