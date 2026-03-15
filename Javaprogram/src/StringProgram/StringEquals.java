package StringProgram;

public class StringEquals {

	public static void main(String[] args) {
		
		String s1="Chennai";
		String s2="Chennai";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		// output returns true due to this kind of declaring variable in String datatype
		
		String c1=new String("Mumbai");
		String c2=new String("Mumbai");
		System.out.println(c1==c2);    // this becomes false as it compares the object because of 'new' keyword 
		System.out.println(c1.equals(c2)); // this becomes true as it compares the value of the object
		
		String p1="Good";
		String p2=new String("Good");
		System.out.println(p1==p2); // this becomes false as it compares the object because of new keyword
		System.out.println(p1.equals(p2)); // this becomes true as value of the object matches
		
		String R1="Evening";
		String R2=new String("Evening");
		String R3=R2;
		System.out.println(R1==R2); //false
		System.out.println(R1.equals(R2)); // true
		System.out.println(R2==R3);// true
		System.out.println(R1==R3); //false
		System.out.println(R1.equals(R3)); //true
		
		// Whenever we create string variable with 'new' keyword, always use equals() method instead of == . 
		
		
		
		
		
		
		
		
		

	}

}
