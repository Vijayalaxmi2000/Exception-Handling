package com.jsp.exceptionHandling;

public class ThrowAndThrows 
{
	public void check(int a,int b) throws Exception
	{
		throw new Exception();
	}

	public static void main(String[] args)
	{
		ThrowAndThrows t1=new ThrowAndThrows();
		try
		{
			t1.check(1, 2);
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}
		try
		{
			t1.check(-1, 2);
		}
		catch(Exception e2)
		{
		
			e2.printStackTrace();
		}

	}

}
