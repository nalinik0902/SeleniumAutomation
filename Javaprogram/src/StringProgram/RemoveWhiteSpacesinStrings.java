package StringProgram;

public class RemoveWhiteSpacesinStrings {

	public static void main(String[] args) {
		
		String s="welcome   to   Java";
		String x=s.replaceAll("\\s", ""); // used to remove spaces whereever the spaces in string
		System.out.println(x);

	}

}
