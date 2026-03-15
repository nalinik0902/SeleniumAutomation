package TypeCasting;


	class parent{
		int x=10;
		void display()
		{
			System.out.println("Hi");
		}
	}
	class child extends parent{
		int y=5;
		void show()
		{
		 System.out.println("Hello");
		}
		
	}
	public class TypeCastingObject1 {
	public static void main(String[] args) {
		  /*
            child ch =new child();    // you can access both variable and method from both child class and parent class
            System.out.println(ch.y);
            ch.show();
            System.out.println(ch.x);
            ch.display();
            */
		/*
		parent p=new child();  // parent class reference variable can always holds child class object
		                       // even though it creates the object of the child class, we can only access parent class's variable and method
		                       // upcasting- converting child to parent
		p.display();
		System.out.println(p.x);   
		//p.y;       can't access child class's variable and method from parent class's object
	    //p.show();   can't access
		*/
		
		// Downcasting
		parent p=new parent();
		child c=(child)p;
		System.out.println(c.x);
		System.out.println(c.y);
		c.display();
		c.show();
		// but this shows runtime error about casting . 
		
		
            
	}

}
