package org.htjava.util.io;


public class WriterSBAppend implements Writer {

	StringBuilder out;
	
	public WriterSBAppend(StringBuilder out) {
		this.out=out;
	}

	public void write(String s) {
		out.append(s);
	}
	
}
