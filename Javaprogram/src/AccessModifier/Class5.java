package AccessModifier;

public class Class5 {

		
		public int z=20;                 // Public variable
		public void show() {            // Public Method
			System.out.println("Hi");
		}
		public static void main(String[] args) {
			
			Class5 c5=new Class5();
			System.out.println(c5.z);
			c5.show();
	}

}
