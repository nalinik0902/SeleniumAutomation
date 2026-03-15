package AccessModifier2;

import AccessModifier.Class1;
import AccessModifier.Class5;

public class Class6 extends Class1 {          // through inheritance, accessing protected variable and method of the class from outside of the package, use extends and import packagenmae.classname 

	public static void main(String[] args) {
		
		Class6 c3=new Class6();
		c3.display();
		System.out.println(c3.x);
		
		
		// Accessing public variable and method from another class from another package - needs import packagename.classname
		Class5 c5=new Class5();
		c5.show();
		System.out.println(c5.z);
		
		

	}

}
