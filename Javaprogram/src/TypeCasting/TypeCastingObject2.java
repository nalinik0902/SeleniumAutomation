package TypeCasting;

class animal{
	
}
class cat extends animal{
	
}
class dog extends animal{
	
}

public class TypeCastingObject2 {

	public static void main(String[] args) {
		
		/*
		 TypeCasting has three rule which should be satisfied
		  syntax- A B=(C) D
		  Rule 1. comparison of C and D must have some relationship. if not satisfied, it shows compiler error
		  Rule 2. Assignment - C should be either same or child of A. if not satisfied, it shows compiler error
		  Rule 3. Underlying object type of D should be either same or child of C .if not satisfied, it will throw exception at runtime
		 
		 */
	 animal an=new dog();
	 dog dg=(dog)an;          // rule 1,2,3 all satisfied
	}

}
