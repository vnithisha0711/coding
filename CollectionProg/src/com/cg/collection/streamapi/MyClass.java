package com.cg.collection.streamapi;

import com.cg.collection.intf.Intf1;
import com.cg.collection.intf.Intf2;

public class MyClass implements Intf1,Intf2{

	
	@Override
	public void calc(int n1,int n2) {
		System.out.println("result: "+(n1+n2));
	}
	public void show() {
		System.out.println("my own show()");
		
	}
	
}
