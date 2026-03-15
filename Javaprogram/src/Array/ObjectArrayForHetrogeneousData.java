package Array;

public class ObjectArrayForHetrogeneousData {

	public static void main(String[] args) {
		// usualy array store the value in same data type(homogeneous data)
		//but we can use hetrogeneous data by using object array)
		
		Object a[]= {100,"good",10.5,true,'A'}; // here i use object type
		
		// System.out.println(a.length);
		// System.out.println(a[3]);
		
		// read all values in array by using for loop
		
		/*for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		*/
		
		// read all values using for each loop
		
		for(Object x:a) {
			System.out.println(x);
		}
		
		

	}

}
