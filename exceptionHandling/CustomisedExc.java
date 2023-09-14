package com.jsp.exceptionHandling;

class House extends RuntimeException
{
	String msg;
	public House(String msg)
	{
		this.msg=msg;
	}
	public String getMessage()
	{
		return msg;
	}
}

public class CustomisedExc 
{
	public static void main(String[] args) 
	{
		String msg="House is not good";
		House h=new House(msg);
		try
		{
			throw new House(msg);
		}
		catch(House h1)
		{
			System.out.println(h.getMessage());
		}

	}

}