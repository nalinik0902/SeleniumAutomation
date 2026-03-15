package Array;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		// Array is a collection of elements in the same datatype (Homegeneous Data)
		// we can store multiple values in single variable.
		
		// Single dimensional array we have only rows.
		
		// Declaring Array
		// Assigning values to array
		// size of array
		// read single value from array
		// read multiple value from array
		
		
		//Approach 1
        /*int a[]=new int[5];  // This approach can be used when you have fixed array size and you dont change this size in future
        a[0]=100;
        a[1]=200;
        a[2]=300;
        a[3]=400;
        a[4]=500;
        
        System.out.println(a.length);  
        System.out.println(a[2]);
        */
		
		//Approach 2
		/*int a[]= {100,200,300,400,500,600};
		System.out.println(a[4]);    // To read the single value of the array
		System.out.println(a.length); // To print the size of the array
		*/
		
		// How to read multiple values from the array 
		// This can be achieved by using FOR Loop and For Each loop
		// using FOR Loop below
		/*int a[]= {100,200,300,400,500};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		*/
		
		// FOR each Loop
		int a[]= {100,200,300,400,500};
		for(int x:a)        // first a[0] will assign to value of X and print it. like a[1] will assign to value of X and print
		{
			System.out.println(x);
		}
		
		// iF you want to print particular value from array then no need to use loop 
		// if you want to read all the values in array , use for or for each loop
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
