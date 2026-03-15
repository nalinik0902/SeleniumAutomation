package Conditionalstatement;

public class PrintWeekNames {

	public static void main(String[] args) {
		
		// Print week names by enter week number

		int weeknum=7;
		
		if(weeknum==1) {
			System.out.println("sunday");
		}
		else if(weeknum==2)
		{
			System.out.println("Monday");
		}
		else if(weeknum==3)
		{
			System.out.println("Tuesday");
		}
		else if(weeknum==4)
		{
			System.out.println("wednesday");
		}
		else if(weeknum==5)
		{
			System.out.println("Thursday");
		}
		else if(weeknum==6)
		{
			System.out.println("Friday");
			
		}
		else if(weeknum==7)
		{
			System.out.println("Saturday");
		}
		
		else
		{
			System.out.println("Wrong");
		}

	}

}
