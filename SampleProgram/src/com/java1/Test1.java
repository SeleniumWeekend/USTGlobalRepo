package com.java1;

import java.util.concurrent.TimeUnit;

public class Test1 implements Cloneable
{
	int i = 100;
	int j = 200;
	
	void m1()
	{
		System.out.println(i+" , "+j);
	}
	
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Test1 t1 = new Test1();
		t1.m1();
		t1=null;
		t1.m1();
				
	}
}
