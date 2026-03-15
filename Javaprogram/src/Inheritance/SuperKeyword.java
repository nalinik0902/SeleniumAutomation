package Inheritance;

// Super keyword only used in Inheritance
// super keyword will be used to invoke the immediate parent class variable and method.

class P{
	String color="Blue";
	void display() {
		System.out.println(color);
	}
	void show() {
		System.out.println("The color is blue");
	}
	
}
class Q extends P{
	String color="Pink";  // variable overridden
	void display() {
		System.out.println(super.color);  // if you want to invoke parent class variable from child class object
	}
	void show() {        // method overridden
		//System.out.println("The color is beautiful");
		super.show();
	}
	
}

public class SuperKeyword {

	public static void main(String[] args) {
		Q qobj=new Q();
		qobj.display();   // it will invoke parent class vaiable , because child class implements with super keyword 
		qobj.show();      // it will invoke parent class method because child class method implements with super keyword

	}

}
