package com.exceptionHandling;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		try {
			System.out.println("Enter the first number:-");
			int num1 = sc.nextInt();
			
			System.out.println("Enter the first number:-");
			int num2 = sc.nextInt();
			
			int result = num1/num2;
			System.out.println("Result of division:- "+result);
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Exception is handled...");

	}

}
