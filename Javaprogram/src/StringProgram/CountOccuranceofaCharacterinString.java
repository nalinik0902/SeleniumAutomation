package StringProgram;

public class CountOccuranceofaCharacterinString {

	public static void main(String[] args) {
		
		String s="Java program is easy";
		int x=s.length(); // first get the length of string
         System.out.println(x);
         int y=s.replace("a", "").length(); // replace 'a'
         System.out.println(y);
         int count=x-y; // substract both counts
         System.out.println(count);
	}

}
