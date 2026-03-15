package WrapperClass;

public class DataConversion {

	public static void main(String[] args) {
		/*
		wrapper class is used to converting data from one format to another format.
		Primitive data type has it's corresponding wrapper class
		
		  int - Integer
		  float - Float
		  double - Double
		  char - Character
		  short - Short
		  long- Long
		  boolean - Boolean
		 
		 ----> convert from String format to - Primitive data type format(int,double,boolean,long,short,float)
		                    String ------> Char convertion is impossible
		                    String ------> boolean . if value of string is other than 'True' , it will return only false
		 -----> converting from primitive data type to String format.
		                   char ---------->string is possible.
		                   
		                   
		 prerequisite - value of string should be in numeric when converting string to primitive data type. 
		                   
		*/
		// String to int conversion
		String s1="10";
		System.out.println(Integer.parseInt(s1));	
		String s2="5";
		System.out.println(Integer.parseInt(s2));
		//System.out.println(s1+s2); // this will only concatenate s1 and s2 value . Though the value is in numeric but format is string. we need convertion 
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		
		// String to double
		String x="10.5";
		String y="20.5";
		System.out.println(Double.parseDouble(x)+Double.parseDouble(y));
		
		// String to Boolean
		String Z="10"; // other than True, it returns false 
		// String w="True";
		System.out.println(Boolean.parseBoolean(Z));
		
		// convert all primitive datatype to String format using String.valueOf()
		
		int a=10;
		float b=10.5f;
		char c='G';
		boolean d=true;
		

		String s=String.valueOf(a);
		System.out.println(s);
		s=String.valueOf(b);
		System.out.println(s);
		s=String.valueOf(c);
		System.out.println(s);
		s=String.valueOf(d);
		System.out.println(s);
		
		
				
				
					
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
