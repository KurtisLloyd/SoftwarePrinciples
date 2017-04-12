package Decorators;

import java.io.IOException;
import java.io.Writer;

public abstract class WriterDecorator extends Writer {
	
	protected Writer writer;
	
	public WriterDecorator(Writer writer){
		this.writer = writer;
	}
	


	

}
