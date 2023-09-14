package com.jsp.exceptionHandling;

class Car extends Exception
{
	String msg;
	 public Car(String msg)
	    {
	    	this.msg=msg;
	    }
		public static void check() throws Car
		{
			throw new Car("Car is not good");
		}	
}
public class CarCustomizedExc 
{
	public static void main(String[] args)
	{
	   try
	   {
		  Car.check();
	   }
	   catch(Car e)
	   {
		   System.out.println(e.msg);
	   }

	}

}
