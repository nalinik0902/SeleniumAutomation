package JavaOOPSConcept;

public class EmployeeClass {
     // class is the collection of attributes or behaviour.
	 // class is the collection of variables and methods 
	 // class is blueprint of an object 
	 // class is logical entity .
	// Object is an instance of an class. object is physical entity.
	
	// Variables  - these are class variable
	int eid;
	String ename;
	int salary;
	String job;
	
	//Method - is block or group of statements that perform certain task
	// we have to call the method through object.
	
	void printdata()  // if the output doesnt return anything at runtime , put void. if returns, put data type before method();
	{
		System.out.println(eid+" "+ename+" "+salary+" "+job);
	}
	 // Method
	void setdata(int id,String name,int sal,String jobrole) // LOcal variable
	{
		eid=id;
		ename=name;
		salary=sal;
		job=jobrole;
		
	}
	
	//Constructor
	EmployeeClass(int id, String name, int sal,String jobrole){
		eid=id;
		ename=name;
		salary=sal;
		job=jobrole;
		
	}
	
}
