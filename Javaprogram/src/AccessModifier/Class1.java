package AccessModifier;

public class Class1 {
	
	/* Types of Access Modifier
	   Private - access only with in the class
	   Default - access within the package
	   Protected- access outside of the package through inheritance
	   Public - directly access all variables and methods everywhere.
	 */
	
	protected int x=10;                 // protected variable
	
	 protected void display() {         // protected method
		System.out.println("Hello");
	}
 
	public static void main(String[] args) {
	 Class1 c=new Class1();
	 c.display();            
	 System.out.println(c.x);
	 

	}

}
