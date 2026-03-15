package SampleProgram;

public class SearchElementInArray {

	public static void main(String[] args) {
	     // Linear search 
		int a[]= {3,4,5,7,9,2};
		int search_element=9;
		boolean status=false;
		// using for loop
		/*for(int i=0;i<a.length;i++)
		{
			if(a[i]==search_element)
			{
				System.out.println("Element is found");
				status=true;
				break;
			}
			
		}
		if(status==false)
		{
			System.out.println("Element is not found");
		}
		*/
		
		// using enhanced for loop
		 for(int x:a) {
			 if(x==search_element) {
				 System.out.println("Element is found");
				 status=true;
				 break;
			 }
		 }
		 if(status==false)
		 {
			 System.out.println("Element is not found");
		 }
		

	}

}
