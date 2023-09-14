package com.jsp.exceptionHandling;

public class ArithmeticExc 
{
	public static void number(int n)
	{
		int res=1000/n;
		System.out.println(res);
	}

	public static void main(String[] args) 
	{
		number(5);
		number(0);
		number(1);

	}

}
