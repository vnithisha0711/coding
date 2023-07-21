package com.cg.collection;

import com.cg.collection.intf.Intf1;
import com.cg.collection.intf.Intf2;

public class TestLambda {

	public static void main(String[] args) {
		// use of anonymous class
		Intf2 intf=new Intf2() {

			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("Anonymous class's show()");
				
			}
			
		};
		intf.show();
		
		//use of Lambda expression
		Intf2 lambdaIntf=()->System.out.println("Hi!! from Lambda");
		
		lambdaIntf.show();
		//Intf1 lambdaIntf1=(n1,n2)->{ return (n1+n2); };
		Intf1 lambdaIntf1=(n1,n2)->System.out.println("result:"+(n1+n2));
		lambdaIntf1.calc("s",20); //method invocation
	}

}
