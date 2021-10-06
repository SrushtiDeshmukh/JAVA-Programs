//Java Program to find the number of the words in the given text file
class Program33
{
	public static void main(String args[])
	{
		String str="Hardships often prepare ordinary people for an extraordinary destiny";
		String words[]=str.split(" ");
		System.out.println(words.length);
	}
}
