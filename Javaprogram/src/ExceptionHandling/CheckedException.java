package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		/*
		 Whenever the statement in a program throws exception, the program will get terminated and rest of the stateent will not get executed.
		 In order to handle the exception and run the statement without interruption is called exception handling. 
		 */

		/*
		   The checked exceptions are identified by java compiler. 
		   File not found exception, IO Exception, Interrupted exception
		   It can be handled in two ways - using try and catch block , throws in method level
		   mostly we use throws in checked exception
		   */
		System.out.println("Program started");
		System.out.println("Program is processing");
		Thread.sleep(5000); // will wait 5 seconds to proceed the next step- 5seconds should be in milliseconds // it will throw Interruptted exception// need to add throw declaration in method level
		FileInputStream fis=new FileInputStream("c:\\text.text.in"); // import fileinputstream, it will throw file not exception , add throws i method level
		System.out.println("Program is validating");
		System.out.println("Program is ending");
		

	}

}
