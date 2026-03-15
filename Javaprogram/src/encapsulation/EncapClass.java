package encapsulation;

public class EncapClass {

	// Encapsulation- wrapping up of data and method into a single unit.
	// Data security/ Data hiding
	
	// Variables should be private so that it can't be accessed from outside of the class.
	// Every variables should have setters and getters
	// variables should be operated through methods only
	
	private int x,y;
	private String name;
	
	void setdata(int a,int b) {
		x=a;
		y=b;
		
	}
	void getdata()
	{
		System.out.println(x);
		System.out.println(y);
	}
	
	void setname(String name) {
		this.name=name;          // this refers to class variable. when local variable name and class variable name are same, use this 
		
	}
	
	String getname()
	{
		return name;
	}
	
	
	
}
