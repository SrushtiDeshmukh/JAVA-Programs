/*
	11 12 13	13 12 11	31 32 33
	21 22 23	23 22 21	21 22 23
	31 32 33	33 32 31	11 12 13
*/

/****************************************************Left Lower triangle*********************************************************/
/*
	*	
	*	*	
	*	*	*	
	*	*	*	*	
	*	*	*	*	*	
	*	*	*	*	*	*		
*/
class Program6
{
	public static void main(String args[])
	{
		int n=6;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*\t");
			}
			System.out.println();
		}
	}
}



/*****************************************************right lower triangle******************************************************/
/*
					*	
				*	*	
			*	*	*	
		*	*	*	*	
	*	*	*	*	*	
*	*	*	*	*	*	
*/
class Program6
{
	public static void main(String args[])
	{
		int n=6;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n;j++)
			{
				if(j>=i)
					System.out.print("*\t");
				else
					System.out.print("\t");
			}
			System.out.println();
		}
	}
}

/*****************************************************left upper triangle******************************************************/
/*
*	*	*	*	*	*	
*	*	*	*	*		
*	*	*	*			
*	*	*				
*	*					
*
*/			
class Program6
{
	public static void main(String args[])
	{
		int n=6;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n;j++)
			{
				if(i>=j)
					System.out.print("*\t");
				else
					System.out.print("\t");
			}
			System.out.println();
		}
	}
}


/*******************************************************right upper triangle*******************************************************/
/*
*	*	*	*	*	*	
	*	*	*	*	*	
		*	*	*	*	
			*	*	*	
				*	*	
					*	

*/
class Program6
{
	public static void main(String args[])
	{
		int n=6;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j>=i)
				System.out.print("*\t");
				else
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}

/********************************************************pyramid********************************************************/
/*
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 
* * * * * * 

*/
class Program6
{
	public static void main(String args[])
	{
		int n=6;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=1;j--)
			{
				if(i>=j)
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
