package Inheritance;

 /*Difference between Method overriding and Method over loading
 Overriding:
	 1. Belongs to INheritance
	 2. Possible only in multiple classes(Inheritance)
	 3. we should not change the method declaration and body we should change
	 4. method names are same
	 
 OverLoading:
     1. Belongs to Polymorphism
     2. Possible in single and multiple classes(Inheritance)
     3. We should change the method declaration
     4. Method names are same
     
     Note- we can acchieve combination of method overloading and method overriding in Inheritance
  */   	 
 class ABC{
	 void m1(int a) {
		System.out.println(a); 
	 }
	 void m2(int b) {
		 System.out.println(b);
	 }
 }
 class xyz extends ABC{
	 void m1(int a)    // overriding 
	 {
		 System.out.println(a*a);
	 }
	 void m2(int a, int b) {        // overloading 
		 System.out.println(a+b);
	 }
	 
 }


public class OverRidingvsOverLoading {

	public static void main(String[] args) {
		
      xyz x=new xyz();
      x.m1(10);
      x.m2(20);
      x.m2(3, 6);
	}

}
