package com.string;

public class Test1 {

	public static void main(String[] args) 
	{

		String s1 = new String("My Name Is Khan");
		String s2 = new String("My Name Is Khan");
		System.out.println(s1==s2);
		
		String s3 = "My Name Is Khan";
		
		System.out.println(s1==s3);
		
		String s4 = "My Name Is Khan";
		System.out.println(s3==s4);
		
		String s5 = "My Name"+" Is Khan";
		
		System.out.println(s3==s5);
		
		String s6 = "My Name";
		
		String s7 = s6+" Is Khan";
		System.out.println(s3==s7);
		
		final String s8 = "My Name";
		
		String s9 = s8+" Is Khan";
		System.out.println(s3==s9);
		System.out.println(s6==s8);
	}

}
