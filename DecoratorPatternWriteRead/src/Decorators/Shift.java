package Decorators;

import java.io.IOException;
import java.io.Writer;

public class Shift extends WriterDecorator {

	public Shift(Writer writer) {
		super(writer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void close() throws IOException {
		writer.close();
		
	}

	@Override
	public void flush() throws IOException {
		writer.flush();
		
	}
	@Override
	public void write(String input)throws IOException{
		char[] charArray = input.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			charArray[i] = (char) (charArray[i] +1);
		}
		
	
		input = new String(charArray);
		writer.write(input);
		
	}

	@Override
	public void write(char[] cbuf, int off, int len) throws IOException {
		writer.write(cbuf, off, len);		
	}

}
