package AccessModifier;

public class Class4 {
	
	private int x=10;            // Private variable
	
	 private void display() {    // Private method
		System.out.println("Hello");
	}

	public static void main(String[] args) {
	 Class4 c=new Class4();
	 c.display();            // since the method and variable are private, we can access only within the class.
	 System.out.println(c.x);

}
}
