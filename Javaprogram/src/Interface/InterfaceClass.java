package Interface;
 /*
  1. Interface is a blue print of class.
  2. Interface contains static and final variables. 
  3. Methods in interface should be public .
  4. Interface supports abstract method . after java 8, default and static method is supported.
  5. Abstract method is a method which contains method declaration and not implementation.
  6. Interface supports multiple inheritance
  7. we can create object reference for interface but we cannot instantiate interface.
  8. A class extends another class, an interface extends another interface and class implements an interface. 
   
  */

interface shape{
	int x=10;       // this variable treats as static and final 
	int y=20;
	
	void circle();   // Abstract method (only declaration) we need class for implementation.
	
	default void square() {     // Default method 
		System.out.println("This is square shape");
	}
	static void rectangle() {   // static method
		System.out.println("This is rectangle");
	}
}

	 
public class InterfaceClass implements shape  {
	public void circle() {
		System.out.println("This is Circle");    // implemenation for abstract method
	}
		
	 void triangle() {
			System.out.println("This is Triangle");
		}
		
	
	

	public static void main(String[] args) {
		// Approach 1 - creating Object for the class 
		InterfaceClass i=new InterfaceClass();
		i.circle();
		i.square();
		shape.rectangle();   // static method can be accessed directly from Interface. 
		i.triangle();
		//triangle(); if the triangle method is static
		
		// Approach 2- Object reference for interface but not instantiate the interface 
		shape s=new InterfaceClass();
		s.circle();
		s.square();
		shape.rectangle(); // static method can be accessed directly from Interface.
		// s.triangle(); we cannot access this method as this method is not available in Interface. 
		
		
		
		

		
		

	}

}
