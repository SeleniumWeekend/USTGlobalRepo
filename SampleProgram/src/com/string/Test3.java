package com.string;

public class Test3
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("developer");
		
		int count=0;
		
		for(int i=0; i<=sb.length()-1; i++)
		{
			count=0;
			for(int j=0; j<=sb.length()-1; j++)
			{
				if(j<i && sb.charAt(i)==sb.charAt(j))
				{
					break;
				}
				
				if(sb.charAt(i)==sb.charAt(j))
				{
					count++;
				}
				
				if(j==sb.length()-1)
				{
					System.out.println(sb.charAt(i)+" = "+count);
				}
			}		
		}
	}
}


