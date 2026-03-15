package JavaOOPSConcept;

public class TypesOfConstructor {
	
	int x,y;
	
	TypesOfConstructor(){     // Default constructor
		x=100;
		y=200;
		}
	TypesOfConstructor(int a, int b){    // Parametrized constructore
		x=a;
		y=b;
	}
	// To perform some operations , use methods()
	void sum()
	{
		System.out.println(x+y);
	}
	

	public static void main(String[] args) {
		
		/* 
		  TypesOfConstructor c=new TypesOfConstructor(); // This invoke Default constructor as there are no parameters
		  c.sum();
		*/
		  TypesOfConstructor co=new TypesOfConstructor(10,30);   // This invoke Parameterized constructor
		  co.sum();

	}

}
