import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import Decorators.Signature;

public class Main {

	public static void main(String[] args) {
		
		//Section for Testing
		
		
		try {
			
			Writer decWriter = new Signature(new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:/SendToThis.txt"))));
			decWriter.write("There should be things at the bottom of this page");
			decWriter.flush();
		
			
//			Writer w = new FileWriter("C:/SendToThis.txt");
//			w.write("This File should have shizz in it!");
//			w.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
