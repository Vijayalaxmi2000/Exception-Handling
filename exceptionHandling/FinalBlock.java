package com.jsp.exceptionHandling;

public class FinalBlock 
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
			System.out.println("Exception handled");
		}
		
		finally
		{
			try
			{
				int [] a1= {10,20,30};
				System.out.println(a1[n]);
			}
			catch(Exception e)
			{
				System.out.println("Invalid index");
			}	
		}
		
	  }

	public static void main(String[] args) 
	{
		number(5);
		number(0);
		number(1);

	}

}
