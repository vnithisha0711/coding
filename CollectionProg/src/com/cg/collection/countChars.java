package com.cg.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countChars {
	public static HashMap countChars(char[] a) {
		HashMap hm=new HashMap();
		for(int i=0;a[i]!='\0';i++) {
			if(hm.containsKey(a[i])) {
			    int count = hm.get(a[i]);
				hm.put(a[i],++count);
			}
			else {
				hm.put(a[i],1);
			}
		}
		return hm;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while(true) {
			System.out.println("enter char array: ");
			Scanner sc=new Scanner(System.in);
			String s=sc.next();
			System.out.println(countChars(s.toCharArray()));
		}
	}

}
