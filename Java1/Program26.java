// Java Program to determine whether one string is a rotation of another
class Program26
{
	public static void main(String args[])
	{
		String str1="deabc";
		String str2="abcde";
		
		str1=str1.concat(str1);
		if(str1.indexOf(str2)!=-1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	
}
