package Inheritance;
/*
 Final keyword can be applied to variables, methods and class.
Final in variable - cannot change the value of the variable.
Final in method - cannot overridden the method.
Final in class - cannot extends the class
*/

final class a{
	final int x=30;
	final void display()
	{
		System.out.println("welcome");
	}
}
/*
class b extends a{       // cant extends class 'a' as it has final keyword
	void display()       // display method cant be overridden as it has final keyword 
	{
		System.out.println("welcome chennai");
	}
}
*/

	public class FinalKeyword {
	public static void main(String[] args) {
		a aobj=new a();
		//aobj.x=50;      // value of x can't be changed as the final keyword used on variable.
		System.out.println(aobj.x);

	}

}
