package statickeyword;

public class Main {

	public static void main(String[] args) {
		
		DemoStatic.data(); // when accessing static method from static main method in different class , you use classname.methodname
		 // data()         // when accessing static method from static main method in same class, no need to create objects . just put methodname
		
		DemoStatic d=new DemoStatic();   
		d.data1();  // here, i'm accessing non static method from static main method , so we need object creation 
		
		
	}

}
