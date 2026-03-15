package Programme;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritedataintoTextfile {
	
	// How to write data into text file. 

	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("C:\\Users\\Madhu\\Test.text");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Java is easy");
		bw.close();
		
		

	}

}
