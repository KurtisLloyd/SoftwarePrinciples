import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

import Decorators.Shift;
import Decorators.ShiftBack;
import Decorators.Signature;

public class Main {

	public static void main(String[] args) {
		// If you wrap wrapper(1) over Wrapper(2) it will add an signature first then shift all of the characters
		// if you wrap wrapper(2) over Wrapper(1) it will shift everything first and then add an signature to the end.
		
		signature();
		Shift();
		System.out.println(shiftBack());

	}
	
	private static void Shift(){
	
		try {
			Writer writer = new Shift(new BufferedWriter(new OutputStreamWriter(new FileOutputStream("SendToThis.txt"))));
			writer.write("Please Work");
			writer.flush();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void signature(){
		Writer writer;
		try {
			writer = new Signature(new BufferedWriter(new OutputStreamWriter(
			          new FileOutputStream("SendToThis.txt"))));
			
			writer.write("Please Work");
			writer.flush();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
			}
	private static String shiftBack(){
		StringBuilder builder = new StringBuilder();
		try { 
			Reader shiftBack = new ShiftBack(new BufferedReader(new FileReader("SendToThis.txt")));
	        int r;
	        while ((r = shiftBack.read()) != -1) {
	            char nextChar = (char) r;
	            builder.append(nextChar);
	        }
	        shiftBack.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return builder.toString();
		
	}

}
