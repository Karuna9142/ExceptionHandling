package com.exceptionHandling;

public class DivisionExample {
	
	public static int divideNumbers(int dividend, int divisor)
	{
		return dividend/divisor;
		
	}

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 0;
		
		try {
			int result = divideNumbers(num1, num2);
			System.out.println("Result of division:- "+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error: Division by zero is not allowed.");
		}
		finally {
			System.out.println("Finally block is always executed.");
		}
	}

}
