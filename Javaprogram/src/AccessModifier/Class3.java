package AccessModifier;

public class Class3 {

		 int x=10;                          // Default variable
		 
		 void display() {                  // Default method
			System.out.println("Hello");
		}
	 
		public static void main(String[] args) {
		 Class3 c=new Class3();
		 c.display();            
		 System.out.println(c.x);
		 

	}

}
