package Loopingstatement;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		// Diff btw while and do while loop
		// while loop checks the condition and then execute the statements. If the condition is not satisfied, it will not excute teh statement
		// Do while loop prints the statement first and then verify the condition. if the condition is not met, it will execute the statement once.
		
	//syntax for do while loop

		/*initialization
		do {
			statement;
			increm/decre
		}while(condition);
		*/
		
		// print number from 1 to 10
		
		/*int i=1;
		do {
			System.out.println(i);
			i++;
			
		}while(i<=10);
		*/
		
		//print number from 10 to 1
		int i=10;
		do {
			System.out.println(i);
			i--;
		}while(i>=1);
		
		

	}

}
