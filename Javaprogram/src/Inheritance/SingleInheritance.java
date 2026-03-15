package Inheritance;

// Inheritance - Acquiring the properties(variable) and behaviour (methods) of one class into another class.
// Advantage - code reusability and avoid code duplication

// Single Inheritance (single parent , single child)
class A
{
   int a=10;
   void display()
   {
	   System.out.println(a);
   }
}
class B extends A
{
	int b=12;
	void print() {
		System.out.println(b);
	}
}



public class SingleInheritance {

	public static void main(String[] args) {
		
        B bobj=new B();
        System.out.println(bobj.a);
        System.out.println(bobj.b);
        bobj.display();
        bobj.print();
        
	}

}
