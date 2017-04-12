package Decorators;

import java.io.IOException;
import java.io.Reader;

public abstract class ReaderDecorator extends Reader {
	
	protected Reader reader;
	public ReaderDecorator(Reader reader){
		this.reader = reader;
	}
	

}
