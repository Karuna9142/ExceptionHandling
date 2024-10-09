package com.exceptionHandling;

//printstacktrace =  prints exception information in the formmat of name of exception.
public class PrintStackTraceEx {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 0;
		
		try
		{
			System.out.println(a/b);
		}catch(ArithmeticException e)
		{
			System.out.println(e);
			e.printStackTrace();
			e.getMessage(); // prints only description of the exception.
			e.toString(); //prints exception information in the format of exception.
			
		}

	}

}
