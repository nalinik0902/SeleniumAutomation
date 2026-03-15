package JavaOOPSConcept;

public class EmployeeMain {

	public static void main(String[] args) {
		// Objects are created under main methods.
		
		// Create object for Employeeclass
		//EmployeeClass emp=new EmployeeClass();
	// Approach 1	
		// using objects, we assign the value for variable in the method
		 /*emp.eid=123;
		 emp.ename="Nalini";
		 emp.job="Tester";
		 emp.salary=20000;
		 emp.printdata();
		 */
	// Approach 2
		// using methods, we assign the value for the variable   
		/*emp.setdata(123, "Nalini", 20000,"Tester");
		emp.printdata();
		*/
	// Approach 3
		// using constructor
		EmployeeClass e=new EmployeeClass(123,"Nalini",20000,"Tester");
		e.printdata();
		
		
		
		
		
		
		

	}

}
