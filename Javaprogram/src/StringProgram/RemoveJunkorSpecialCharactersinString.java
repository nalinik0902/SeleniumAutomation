package StringProgram;

public class RemoveJunkorSpecialCharactersinString {

	public static void main(String[] args) {
		
		String s="@#%^&*()+_!^&$ The time is good";
		// I want to remove all junks and special character in this string.
		
	    String x=s.replaceAll("[^a-zA-Z0-9]", ""); // replace all special characters except letter a-z,A-Z, 0-9 by using ^ char
	    System.out.println(x);
	    

	}

}
