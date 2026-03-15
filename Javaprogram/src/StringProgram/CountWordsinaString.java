package StringProgram;

import java.util.Scanner;

public class CountWordsinaString {

	public static void main(String[] args) {
		
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter a string");
		//String s=sc.nextLine();
		String s="welcome to java";
		int count=1;
		// find find length of the string , then extract each character from the sting 
		for(int i=0;i<s.length()-1;i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println(count);
		

	}

}
