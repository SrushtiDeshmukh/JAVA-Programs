//Java Program to replace lower-case characters with upper-case and vice-versa
import java.util.*;
import java.lang.Character;
class Program23
{
	public static void main(String args[])
	{
		String str="AlwayS DO WhatevwE YoU WanT";
		StringBuilder str2=new StringBuilder(str);
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLowerCase(str.charAt(i)))
				str2.setCharAt(i,Character.toUpperCase(str.charAt(i)));
			else if(Character.isUpperCase(str.charAt(i)))
				str2.setCharAt(i,Character.toLowerCase(str.charAt(i)));
		}
		
		System.out.println(str2);
	}
}



