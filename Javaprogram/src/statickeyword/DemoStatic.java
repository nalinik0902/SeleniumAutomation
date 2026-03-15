package statickeyword;

public class DemoStatic {
	
	// static keyword can be applied for variables and methods.
	
	static int x=10; // if you make the variable as static, then this variable is common between all the objects,
	int y=5;    // non static variable
	
	static void data()
	{
		System.out.println("This is static method");
	}
	
	void data1() {
		System.out.println("This is non-static method");
	}
	

}
