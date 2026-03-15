package Inheritance;

//HierarchyInheritance- one parent can have multiple child classes.

class parent{
	void display(int x) {
		System.out.println(x);
	}
	
}
class child1 extends parent{
	void show(int y) {
		System.out.println(y);
	}
	
}
class child2 extends parent{
	void print(int z) {
	  System.out.println(z);
	}
}

public class HierrarchyINheritance {
	
	
	public static void main(String[] args) {
		
		child1 ch=new child1();
		ch.display(10);
		ch.show(20);
		
		child2 c=new child2();
		c.display(30);
		c.print(40);
		
		

	}

}
