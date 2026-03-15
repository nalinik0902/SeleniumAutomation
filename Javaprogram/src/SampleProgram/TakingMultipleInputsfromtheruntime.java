package SampleProgram;

import java.util.Scanner;

public class TakingMultipleInputsfromtheruntime {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1=sc.nextInt();
		System.out.println("Enter second number:");
		int num2=sc.nextInt();
		System.out.println("Addition of two numbers:"+(num1+num2));
	

	}

}
