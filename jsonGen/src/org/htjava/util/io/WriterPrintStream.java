package org.htjava.util.io;

import java.io.PrintStream;

public class WriterPrintStream implements Writer {

	PrintStream ps;
	
	public WriterPrintStream(PrintStream ps) {
		this.ps = ps;
	}

	public void write(String s) {
		ps.print(s);
	}

}
