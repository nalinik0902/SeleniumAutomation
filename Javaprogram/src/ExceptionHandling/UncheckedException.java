package ExceptionHandling;

import java.util.Scanner;

public class UncheckedException {

	public static void main(String[] args) {
		/*
		 The unchecked exception are not identified by java compiler 
		 it can be handled only through try and catch block. Try block can have multiple Catch block .
		 Finally block is optional to add after the catch block. 
		 finally block always exceutes - if no exception occurs, if an exception occurs and is caught , if an exception occurs and is not caught
		 exceptions are- Arithmetic exception, NullPointerexception,ArrayIndexOutOfBoundException
		  */
		 // Example of NUll pointer exception
		String s=null;
		try                     // whichever statement will be the reason for exception, put those in try block
		{
		System.out.println(s.length());  // This statement is the reason for NUll pointer exception
		}
		catch(Exception e) {       // catch block will handle the exception, if you know the name of the exception, put that in catch block otherwise put Exception e - it will handle all type of exception 
			System.out.println(e.getMessage());   // this will get the message about exception
			System.out.println("Exception handled");
		}
		
		// Exmple of Arithmetic Exception
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		try {
		System.out.println(100/num);   // any number divisble by zero throws Arithmetic exception
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Exception handled");
		}
		finally {
			System.out.println("Finally block executed");
		}
		
	}

}
