package Inheritance;
/*
Multiple Inheritance - multiple parent can have single child.

Multiple Inheritace cannot implement using class concept like single, multi level and hierarchy. we can implement using interface concept. 
	
why class concept is not supported for multiple inheritance?
		Ans- because extends keyword is supported only one class at a time when you extending multiple parent class into child class
	  
*/

interface P1{      
	void m1();  // Abstract method ( only declaration)
}
interface P2{
	void m2();
}
class c3{
	void m3() {
		System.out.println("This is m3");
	}
}

public class MultipleInheritance extends c3 implements P1, P2 {     
	
	public void m1()         // This is implementation
	{
		System.out.println("This is m1");
	}
	public void m2() {
		System.out.println("This is m2");
	}
	
	  

	public static void main(String[] args) {
		MultipleInheritance m=new MultipleInheritance();
		m.m1();
		m.m2();
		m.m3();
		
		

	}

}
