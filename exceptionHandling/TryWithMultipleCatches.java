package com.jsp.exceptionHandling;

public class TryWithMultipleCatches 
{
  public static void number(int n)
  {
	try
	{
		int res=1000/n;
		System.out.println(res);
		int [] a1= {10,20,30};
		System.out.println(a1[n]);
	}
	catch(ArithmeticException ae)
	{
		System.out.println("Invalid number for div");
	}
	catch(Exception e)
	{
		System.out.println("Invalid index");
	}
	
  }
	public static void main(String[] args) 
	{
		number(5);
		number(0);
		number(1);

	}

}

