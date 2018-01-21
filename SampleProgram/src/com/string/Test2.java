package com.string;

/*
a - z - >  97 98 99 ....... 121 122
A - Z - >  65 66 67 ....... 89  90 

*/

public class Test2 
{
	public static void main(String[] args) 
	{
		String s1 = "QLCTech";	
		for(int i=0; i<=s1.length()-1; i++)
		{
			int ch = s1.charAt(i);
			if(ch>=97 && ch<=122)
			{
				ch = ch-32;
				char c = (char)ch;
				System.out.print(c);
			}
			else if(ch>=65 && ch<=90)
			{
				ch = ch+32;
				char c = (char)ch;
				System.out.print(c);
			}
		}
	}
}