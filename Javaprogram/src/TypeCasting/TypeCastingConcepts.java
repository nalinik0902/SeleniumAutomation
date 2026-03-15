package TypeCasting;

public class TypeCastingConcepts {

	public static void main(String[] args) {
		
		/*
		 Upcasting - converting value from smaller to larger (Automatic process)
		 int ----> long
		 float -----> Double
		 Downcasting - converting value from larger to smaller (Manual process)
		 Double ------->float
		 long---------->int
	     
		 */
		
		// upcasting
		int intvalue=100;
		long longvalue=intvalue;
		System.out.println(longvalue);
		
		float floatvalue=10.5f;
		double doublevalue=floatvalue;
		System.out.println(doublevalue);
		
		// Down casting  -  when converting from larger to smaller, we need to reduce the size from large value and store into the small datatype
		long lvalue=10000;
		int ivalue=(int)lvalue;
		System.out.println(ivalue);
		
		double dvalue=135.687998888;    // when it reduce the size, some value will be lost. 
		float fvalue=(float)dvalue;
		System.out.println(fvalue);

	}

}
