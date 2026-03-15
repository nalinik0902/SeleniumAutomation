package Conditionalstatement;

public class Switchcasestatement {

	public static void main(String[] args) {
		
		// switch is used to reduce the if else conditions.
		// switch is used when there are multiple conditions
		
		// syntax of switch case statement
		
		/*
	    switch(variable)
		{
		 case valueofvariable : statement;break;
		 default : statement;
		}
		*/
		
		// Here we take example of print weekname by entering week numbers
		
		int weeknum=8;
		
		switch(weeknum) {
		case 1: System.out.println("Sunday");break;
		case 2: System.out.println("Monday");break;
		case 3: System.out.println("Tuesday");break;
		case 4: System.out.println("Wednesday");break;
		case 5: System.out.println("Thursday");break;
		case 6: System.out.println("Friday");break;
		case 7: System.out.println("Saturday");break;
		default:System.out.println("Invalid week number! Please enter 1 to 7.");break;
		
		}
		
		
		
		

	}

}
