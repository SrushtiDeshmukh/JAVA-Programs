//Java Program to replace the spaces of a string with a specific character
class Program24
{
	public static void main(String args[])
	{
		String str="Do Whatever you want!";
		
		str=str.replace(' ','-');
		System.out.println(str);
	}
}

/***************************************************************OR*********************************************************************/

class Program24
{
	public static void main(String args[])
	{
		String str="Do Whatever you want!";
		
		str=str.replace('\s','-');
		System.out.println(str);
	}
}

