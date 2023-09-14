package com.jsp.exceptionHandling;
 
class House extends Exception
{
	public House(String msg)
	{
		super(msg);
	}
	public static void check() throws House
	{
		throw new House("House is ossum");
	}
}
public class CustomisedException 
{
	

	public static void main(String[] args) 
	{
	   try
	   {
		   House.check();
	   }
	   catch(House h1)
	   {
		   h1.printStackTrace();
	   }

	}

}
