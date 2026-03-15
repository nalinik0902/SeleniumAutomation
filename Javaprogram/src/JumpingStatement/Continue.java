package JumpingStatement;

public class Continue {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;    // when i value matches 5 , it will skip number 5 and continue to 6
				             // output will be 1 2 3 4 6 7 8 9 10
				
			}
			System.out.println(i);
		}

	}

}
