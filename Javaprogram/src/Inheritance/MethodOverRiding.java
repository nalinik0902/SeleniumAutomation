package Inheritance;

	// Method Overriding - Whatever method is defined in parent class, after extending into child class, we can recreate those method with changing data but not the method declaration
	// Method overriding is related to Inheritance
	 
	class Bank{
		double roi() {
			return 0;
		}
	}
	class ICICI extends Bank{
		double roi() {
			return 10.5;
		}
	}
	class SBI extends Bank{
		double roi()
		{
			return 11.2;
		}
	}
	public class MethodOverRiding {
	public static void main(String[] args) {
		// you can call those implementation by creating objects
		ICICI ic=new ICICI();
		System.out.println(ic.roi());
		SBI sb=new SBI();
		System.out.println(sb.roi());

	}

}
