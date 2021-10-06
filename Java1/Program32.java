//Java Program to find the largest and smallest word in a string
class Program32
{
	public static void main(String args[])
	{
		String str="Hardships often prepare ordinary people for an extraordinary destiny";
		String words[]=str.split(" ");
		String smallword=words[0],largeword=words[0];
		
		for(int i=0;i<words.length;i++)
		{
			if(words[i].length()<smallword.length())
				smallword=words[i];
				
			if(words[i].length()>largeword.length())
				largeword=words[i];
		}
		System.out.println(smallword);
		System.out.println(largeword);
	}
}
