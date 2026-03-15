package SampleProgram;

import java.util.Scanner;

public class TakingInputFromtheRuntime {

	public static void main(String[] args) {
		
		// Scanner class is used to take input at runtime. 
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		System.out.println("You enter the num:"+num);
		
       */
		// If your input is string
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the city:");
		String city=sc.next();
		System.out.println("The city you enter is:"+city);
		
	}

}
