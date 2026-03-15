package polymorphism;

public class PolyClass {
	// polymorphism - one thing can have many forms. - Method Overloading 
	// Conditions below
	// 1. Method name should be same
	// 2. No of parameter should be different
	// 3. Datatype of parameter should be different
	// 4. order of parameter should be different
	
	//Interview q/a - Can we overload the main method - yes
	
	void data(int x, int y)   // Here method name is same and parameters are different. 
	{
		System.out.println(x);
		System.out.println(y);
	}
	
	void data(int a, int b, int c)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	void data(int z, String name)
	{
		System.out.println(z);
		System.out.println(name);
	}
	
	
	
 
}
