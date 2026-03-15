package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		/*
		 HashSet is a class implemented set interface
		 like Arraylist, hashset stores object type of values not primitive data type 
		 
		 Hashset -
		 1. Heterogeneous data are allowed
		 2. Index order- not preserved (Index not supported)
		 3. Duplicate elements are not allowed
		 4. Multiple nulls are not allowed. Only single nulls are allowed.
		 
		 */
		
		// Declaration of HashSet Class
		HashSet hs=new HashSet();
		  // or
		// Set s=new HashSet();
		
		// Adding element to the hashset
		hs.add(10);
		hs.add(10.5);
		hs.add('A');
		hs.add("Nalini");
		hs.add(true);
		hs.add(null);
		hs.add(10);
		hs.add(null);  
		
		// size of the hashset
		System.out.println(hs.size());
		
		//printing all elements in hashset
		System.out.println(hs);  // this will eliminate copy of duplicate element and keep one null value.
		
		// Inserting elements into hashset is not possible as hashset has no index.
		
		// Remove an element from hashset
		hs.remove('A'); // here we specify value (not index) that you want to remove
		
		// Accessing specific element directly from hashset is not possible because no index in hashset
		   // possible if converting hashset to arraylist 
		  ArrayList al=new ArrayList(hs); // here specify object of the Hashset
		  al.get(4);
		  System.out.println(al);
		  
		// removing multiple elements from hashset is not possible
		  
		 // Reading all elements from Hashset 
		    // It can be achieved using For each (enhanced for loop ) and Iterator
		  /*
		  //Enhanced for loop
		  for(Object x:hs)
		  {
			  System.out.println(x);
		  }
		  */
		  
		  // Iterator
		  Iterator i=hs.iterator();
		  while(i.hasNext()) {
			  System.out.println(i.next());
		  }
		  
		  // remove all elements from the hashset
		  hs.clear();
		  System.out.println(hs.isEmpty()); // this will return true or false
				  
		  
		  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		  
		
		
		

	}

}
