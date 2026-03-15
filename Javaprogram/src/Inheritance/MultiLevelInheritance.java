package Inheritance;

// Multilevel Inheritance - multiple classes . each class can have only one parent

 class x{                // this class'X' is parent to child class 'Y'
	 int a;
	 void de() {
		 System.out.println(a);
	 }
 }
 class y extends x{      // This class 'y' is parent to child class 'z'
	 int e;
	 void el() {
		 System.out.println(e);
	 }
 }
 class z extends y{      // This class 'Z' is child to class 'Y'. It contains both class X and Class Y
	 int f;
	 void ge() {
		 System.out.println(f);
	 }
 }

public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		
		z zobj=new z();
		zobj.a=10;
		zobj.e=20;
		zobj.f=30;
		zobj.de();
		zobj.el();
		zobj.ge();
		
		

	}

}
