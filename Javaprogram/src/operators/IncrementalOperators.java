package operators;

public class IncrementalOperators {

	public static void main(String[] args) {
		// INcremental operator ++ , --
		
		// Increment has two types preincrement and postincrement
		
		/*int a=10;
		int result=a++;  // post increment means - value first assigned to variable and then increment
		System.out.println(result);
		System.out.println(a);
		*/
		
		int a=10;
		int result=++a;  // pre increment means increment happened first and then assigned the value to variable
		System.out.println(result);
		System.out.println(a);
		

	}

}
