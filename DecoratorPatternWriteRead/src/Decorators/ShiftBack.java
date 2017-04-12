package Decorators;

import java.io.IOException;
import java.io.Reader;

public class ShiftBack extends ReaderDecorator {

	public ShiftBack(Reader reader) {
		super(reader);
	}

	@Override
	public void close() throws IOException {
		reader.close();
		
	}

	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		
		return reader.read(cbuf, off, len);
	}

	@Override
	public int read() throws IOException {
		int character = reader.read();
		if(character > 0){
			character--;
		}
		return character;
	}
	
	

}
