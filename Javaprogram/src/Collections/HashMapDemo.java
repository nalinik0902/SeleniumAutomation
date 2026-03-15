package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		/*
		 Hashmap - ia a class implemented map interface
		 Hashmap -
		 1. Data can be stored in the form of key , value pairs
		 2. key is unique. But we can have duplicate values.
		 3. Insertion order-not preserved (Index not followed)
		 
		// Declarion of Hashmap
		/*
		HashMap hm=new HashMap();
		   or
		Map m= new HashMap();  
		*/ 
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>(); // type of key and values specified in angular bracket<>
		 // Here we take example of employee id and employee name.
		// Adding pairs - is the combination of key and value
		hm.put(101, "David");
		hm.put(102, "Ravi");
		hm.put(103, "Gia");
		hm.put(104, "John");
		hm.put(102, "Stella");  // if key is duplicate, the old value of key will be replaced with new value
		hm.put(106, "Ravi");
		System.out.println(hm);
		
		// size of hashmap - means size of pair
		System.out.println(hm.size());
		
		// Remove one of the pair from Hashmap
		hm.remove(104); // Here we need to specify key of the value you want to remove .104 is the key of the pair
		System.out.println("After removing :"+hm);
		
		// Access particular value of the key
		hm.get(103); // here need to mention key of the value you want to access - 103 is the key 
		System.out.println(hm);
		
		
		// Get all the keys from the HashMap
		System.out.println(hm.keySet());  // it will get all the keys in the form of set
		
		
		
		//Get all the values from the HashMap
		System.out.println(hm.values());
		
		//Get all the keys along with the values
		System.out.println(hm.entrySet());
		
		// Reading data from HashMap by using enhance for loop and iterator. normal FOR loop not possible
		
		// For each loop
		/*
		for(int k:hm.keySet()) {
			System.out.println(k+ " " +hm.get(k));
			
		}
		
		*/
		// using iterator
		Iterator <Entry<Integer, String>> it=hm.entrySet().iterator();
		while(it.hasNext()) {
			Entry<Integer, String> entry=it.next();
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
		// clear all pairs from HashMAp
		hm.clear();
		System.out.println(hm.isEmpty());
		
		
		
		
		
		
		
		
		
		
		

	}

}
