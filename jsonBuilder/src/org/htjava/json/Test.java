package org.htjava.json;

import java.util.ArrayList;
import java.util.List;


public class Test {

	static enum Ciao {AAA,BB,CCC};
	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		JSonObj json=new JSonObj();
		
		json.add("num", 17).add("text", "prova prova ciao").add("list", new JSonArray().add(0).add(1).add(1).add(2).add(3).add(5).add(8));

		json.writeTo(s -> System.out.print(s));
		
		
		List<Integer> lst=new ArrayList<Integer>();
		lst.add(null);
		for (int i=1;i<10;i++) {
			lst.add(i*17);
		}
		
		System.out.println();
		
		
		
		json.clear().addObj("xxxYYY",new String[4]).add("result",true).addObj("enum", Ciao.BB).add("array", new JSonArray(lst)).writeTo(s -> System.out.print(s));
		
		
	}

}
