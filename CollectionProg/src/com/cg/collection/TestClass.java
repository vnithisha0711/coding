package com.cg.collection;

import com.cg.collection.intf.StringOperation;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringOperation stringOperation=(String str)->str.length();
		
		int length=stringOperation.getLength("Hello");
		
		
		System.out.println("length of the string="+length);
	}

}
