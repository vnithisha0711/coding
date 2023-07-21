package com.cg.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet ts=new TreeSet();//build the object treeset
		ts.add(35);
		ts.add(20);
		ts.add(45);
		ts.add(35);
		ts.add(50);
		
		System.out.println(ts);
		System.out.println("Total Values:"+ts.size());
		System.out.println("Contains?:"+ts.contains(65));
		System.out.println("First Element: "+ts.first());
		
		Iterator it=ts.iterator();
		System.out.println("output with Iterator:");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(110);
		lhs.add(135);
		lhs.add(150);
		lhs.add(123);
		System.out.println("Data from LinkedHashSet");
		System.out.println(lhs);
		System.out.println("Empty?:"+lhs.isEmpty());
		lhs.remove(123);
		System.out.println("data After Removal:");
		System.out.println(lhs);
		HashSet hs=new HashSet();
		hs.add(220);
		hs.add(250);
		hs.add(300);
		hs.add(280);
		hs.add(205);
		System.out.println("Data from HashSet:");
		System.out.println(hs);
	}
}
