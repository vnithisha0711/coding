package com.cg.io;

import java.io.BufferedInputStream;
import java.io.IOException;

public class StdIODemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedInputStream bi=new BufferedInputStream(System.in);
		try{
			System.out.println("enter value:");
			int data=bi.read();
			//System.out.println(data);
			System.out.println((char)data);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				bi.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
