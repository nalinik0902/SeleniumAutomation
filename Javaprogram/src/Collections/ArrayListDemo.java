package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		/* 
		Collection in java is an interface in java.util package
		Collection(I) extends List(I) and Set(I). 
		List(I) is implemented by ArrayList(C)
		Set(I)is implemented by Hashset(c)
		
		Map(I)is implemented by HashMap(c)
		
		Collection only stores object not primitive data type. if it wants to store primitive, it will convert to wrapper class
		*/
		
		/*
		 Arraylist allows:
		 Heterogeneous data are allowed.
		 Index order-preserved
		 Duplicate elements are allowed
		 Null values are allowed
		 */
		
		// Declaration of an ArrayList
		// ArrayList al=new ArrayList(); this is for storing heterogeneous data 
		// or you can declare like below
		//List l=new ArrayList();    // ArrayList is the child class of parent class 'List'.
		
		/*
		If you want to store only string values in arraylist 
		---->  ArrayList <String>al=new ArrayList<String>();
		 If primitive data type, convert int to wrapper class Integer
		-----> ArrayList <Integer>al=new ArrayList<Integer>();
		*/
		
		ArrayList al=new ArrayList();
		// Adding data to arraylist
		al.add(10);
		al.add(10.5);
		al.add("nalini");
		al.add('A');
		al.add(null);
		al.add(10);
		al.add(null);
		al.add(true);
		//size of the arraylist
		System.out.println(al.size());
		//print all elements in an array list
		System.out.println(al);
		// Remove element from arraylist
		System.out.println(al.remove(5)); //5 is the index of an element
		System.out.println("Ater removing:"+al); 
		
		
		// Insert element in an arraylist
		al.add(2, "Madhu");  // here we add element along with index .nalini in index 2 replaced with madhu and nalini will be moved to next index 3.
		System.out.println("After insertion:"+al);
		
		/* Difference between add(value), add(index,value). 
		add()- will add element at the end of the arraylist
		add(index, value)- insert elements in the middle of the arraylist
		*/
		
		//Modify/replace element in an arraylist;
		al.set(3, 'B');
		System.out.println("After modifying:"+al);
		
		//Access specific element from an arraylist
		System.out.println(al.get(5)); // 5 is an index
		
		// Reading all elements/data from arraylist
		 // 1. use FOR Loop
		/*
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
			
		}
		*/
		
		// 2. using Enhance FOR each Loop
		/*
		for(Object x:al)
		{
			System.out.println(x);
		}*/
		
		// 3. By using iterator (specific to collection concept)
		/*
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(10.5);
		a.add('B');
		a.add(null);
		a.add(true);
		a.add("Java");
		// to read all the elements from Array list using iterator
		Iterator it=a.iterator();    // here we use iterator method and store it in iterator type variable. // we use while loop , because we know how many times it will iterate
		 while(it.hasNext()) {        //hasNext()- checks wheather an element is existing or not. Also, it will move to the next element to check the further elements.
			System.out.println(it.next()); // if the element is exist, it.next() will get that element
		}
		*/
		
		 // Checking ArrayList is empty or not
		System.out.println("Is arraylist empty?:" +al.isEmpty()); // isEmpty() returns true or false
		
		
		// Removing random two or three elemnts from the arraylist at a time
		ArrayList l=new ArrayList();
		l.add(10);
		l.add('A');
		l.add("Python");
		l.add(null);
		l.add(true);
		
		ArrayList l2=new ArrayList();  // we need to create another object of the Arraylist and add whatever elements you want to delete
		l2.add('A');
		l2.add(null);
		
		l.removeAll(l2);    // then use removeAll() method along with parameter (i.e object 2) and remove l2 from L        
		System.out.println(l);
		
		// Remove all the elements from the arraylist.
		l.clear();
		System.out.println("Is arraylist empty?:"+l.isEmpty()); // returns true or false 
		
	

		
		
		
		
		
		
		

		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
