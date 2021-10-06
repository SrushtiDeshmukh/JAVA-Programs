//Java program to find the duplicate words in a string
public class Program30
{
	public static void main(String args[])
	{
		String str="Big black bug bit a big black dog on his big black nose bug";    
		str=str.toLowerCase();
		
		String words[]=str.split(" ");

		for(int i=0;i<words.length;i++)
		{
			int count=1;
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].equals(words[j]) && words[i]!="0")
				{ count++;
				  words[j]="0"; }
			}
			if(count>1)
				System.out.println(words[i]);
		}
	}
}
