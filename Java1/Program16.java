//Java Program to add two matrices
import java.util.*;
class Program16
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter no of rows and col");
		int row=sobj.nextInt();
		int col=sobj.nextInt();
		
		int arr[][]=new int[row][col];
		int brr[][]=new int[row][col];
		int crr[][]=new int[row][col];
		
		System.out.println("Elements of first array ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				arr[i][j]=sobj.nextInt();
			}
		}
		
		System.out.println("Elements of second array ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				brr[i][j]=sobj.nextInt();
			}
		}
		
		System.out.println("Addition is ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				crr[i][j]=arr[i][j]+brr[i][j];	
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(crr[i][j]+" ");	
			}
			System.out.println();
		}
	}
}
