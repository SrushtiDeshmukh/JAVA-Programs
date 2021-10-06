// Java Program to find maximum and minimum occurring character in a string
class Program27
{
	public static void main(String args[])
	{
		String str="baacccdd";//"grass is greener on the other side";
		int freq[]=new int[str.length()];
		int min,max;
		char minchar=str.charAt(0),maxchar=str.charAt(0);
		
		char string[]=str.toCharArray();
		
		for(int i=0;i<string.length;i++)
		{
			freq[i]=1;
			for(int j=i+1;j<string.length;j++)
			{
				if(string[i]==string[j] && string[i]!=' '&& string[i]!='0')
				{
					freq[i]++;
					string[j]='0';
				}
			}
		}
		
		min=max=freq[0];
		for(int i=0;i<freq.length;i++)
		{
			if(min>freq[i])
			{ min=freq[i];
			  minchar=string[i]; }
			  
			 if(max<freq[i])
			 { max=freq[i];
			   maxchar=string[i]; }
		}
		System.out.println("Minimum occurring character "+ minchar);
		System.out.println("Maximum occurring character "+maxchar);
	}
}


