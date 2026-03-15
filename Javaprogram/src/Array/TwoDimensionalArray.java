package Array;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		// Two Dimensional array is having rows and columns
		
		// Approach 1
		/*int a[][]=new int[3][2];   // 3 rows and 2 columns
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		*/
		
		// Approach 2 // Declaring an array
		/*int a[][]= {{100,200},{300,400},{500,600}};  
		System.out.println("no.of rows in an array:"+a.length); // to know size of the row
		System.out.println("no.of columns in an array:"+a[0].length); // to know the size of column
		*/

		// read single value from an array
		//System.out.println(a[2][1]);
		
		// read multiple value from an array using for loop and for each loop
		
       // here we use two for loop . one for rows and other for columns
		/*int a[][]= {{100,200}, {300,400},{500,600}};
		for(int r=0;r<a.length;r++)   // outer for loop for rows
		{
			for(int c=0;c<a[r].length;c++)  // inner for loop for columns
			{
				System.out.println(a[r][c]+ " ");
			}
			System.out.println();
		}
		*/
		
		// For each loop
		int a[][]= {{100,200}, {300,400},{500,600}};
		
		for(int arr[]:a)   // first it takes first row value and put it in single dimensional array
		{
			for(int x:arr)  // that value stores in x 
			{
				System.out.println(x);
			}
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
