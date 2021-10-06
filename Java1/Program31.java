//Java Program to find the frequency of characters
public class Program31
{
	public static void main(String args[])
	{
		String str="baacccddeEeE hjjklmmm";
		str=str.toLowerCase();
		char ch[]=str.toCharArray();
		int frq[]=new int[str.length()];
		
		for(int i=0;i<ch.length;i++)
		{	frq[i]=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j] && ch[i]!=' ' && ch[i]!='0')
				{
					frq[i]++;
					ch[j]='0';
				}
			}
			if(frq[i]>0 && ch[i]!='0'&& ch[i]!=' ')
				System.out.println(ch[i]+"-"+frq[i]);
		}
	}
}

/****************************************************************************************************************************/
public class Program31     
{    
	public static void main(String[] args) 
	{    
            String str = "Picture perfect";
            str=str.toLowerCase();    
            int[] freq = new int[str.length()];    
            int i, j;    
             
            char string[] = str.toCharArray();    
                
            for(i = 0; i <str.length(); i++) 
            {    
                freq[i] = 1;    
                for(j = i+1; j <str.length(); j++) 
                {    
                    if(string[i] == string[j]) 
                    {    
                        freq[i]++;    
                        string[j] = '0';    
                    }    
                }    
            }    
                
            System.out.println("Characters and their corresponding frequencies");    
            for(i = 0; i <freq.length; i++) {    
                if(string[i] != ' ' && string[i] != '0')    
                    System.out.println(string[i] + "-" + freq[i]);    
            }    
        }    
}   
