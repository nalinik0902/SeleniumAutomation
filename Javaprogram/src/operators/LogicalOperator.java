package operators;

public class LogicalOperator {

	public static void main(String[] args) {
		
		// Logical operators - && , || , !
		// return boolean value true/false
		// works between two boolean variables
		
		
		boolean x=true ;
		boolean y=false;
		boolean results=x && y;
		System.out.println(results);
		
		boolean b1=10>5; // true
		boolean b2=5>10; // false
		System.out.println(b1 && b2 );
		System.out.println(b1 || b2);
		System.out.println(!b1);
		System.out.println(!b2);
		System.out.println((10>5) && (5>10));
		System.out.println((10>5) || (5>10));
		System.out.println(!(10>5));
		System.out.println(!(5>10));
		
		
		
		
		
		
		
		

	}

}
