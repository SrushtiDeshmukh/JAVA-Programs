import java.util.*;

class Program5
{
	static void armstrong(int num)
	{
		int cnt=0,rem=0,temp=num,mult,sum=0;
		while(num>0)
		{
			cnt++;
			num=num/10;
		}
		num=temp;
		
		while(num>0)
		{
			mult=1;
			rem=num%10;
			for(int i=1;i<=cnt;i++)
				mult=mult*rem;
			sum=sum+mult;
			num=num/10;
		}
		
		if(sum==temp)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
	}
	
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sobj.nextInt();
		armstrong(num);
	}
}
