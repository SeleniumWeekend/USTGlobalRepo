package com.string;

public class Test4 {

	public static void main(String[] args)
	{
		String s = "i am pritam and i am from india";
		String[] arr = s.split(" ");
		int count =0;
		
		for(int i=0; i<=arr.length-1; i++)
		{
			count =0;
			String s1 = arr[i]; 
			for(int j=0; j<=arr.length-1; j++)
			{
				String s2 = arr[j];
				if(j<i && s1.equals(s2))
				{
					break;
				}
				
				if(s1.equals(s2))
				{
					count++;
				}
				if(j==arr.length-1)
				{
					System.out.println(s1+ " = "+count);
				}
			}
			
		}
	}

}
