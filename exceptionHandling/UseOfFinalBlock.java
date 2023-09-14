package com.jsp.exceptionHandling;

public class UseOfFinalBlock 
{
	public static void number(int n)
	{
		try
		{
			int res=1000/n;
			System.out.println(res);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Invalid number for div");
		}
		finally
		{
			System.out.println("Finally");
		}
	}

	public static void main(String[] args) 
	{
		number(5);
		number(0);
		number(1);


	}

}
