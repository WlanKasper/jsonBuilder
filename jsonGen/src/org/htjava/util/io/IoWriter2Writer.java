package org.htjava.util.io;

import java.io.IOException;

public class IoWriter2Writer extends java.io.Writer  {

	Writer out;
	
	public IoWriter2Writer(Writer out) {
		super();
		this.out=out;
	}

	@Override
	public void write(char[] cbuf, int off, int len) throws IOException {
		out.write(new String(cbuf, off, len));
	}

	@Override
	public void flush() throws IOException {
	}

	@Override
	public void close() throws IOException {
	}
	
}
