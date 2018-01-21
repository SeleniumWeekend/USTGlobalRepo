package com.string;

public class Equals 
{
	int i;
	Equals(int i)
	{
		this.i = i;
		this.i = i;
	}
	
	public boolean equals(Object o1)
	{
		Equals e1 = (Equals)o1;
		int i1 = e1.i;
		if(i1==i)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args)
	{
		Equals e1 = new Equals(10);
		Equals e2 = new Equals(10);
		System.out.println(e1.equals(e2));
		
		String s1 = new String("QLCTECH");
		String s2 = new String("QLCTECH");
		System.out.println(s1.equals(s2));
	}
}
