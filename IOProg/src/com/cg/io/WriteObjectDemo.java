package com.cg.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileOutputStream fo=null;
		ObjectOutputStream os=null;
		
		Product p=new Product(1,"tV",30);
		
		try {
			fo=new FileOutputStream("product.dat");
			os=new ObjectOutputStream(fo);
			
			os.writeObject(p);
			System.out.println("Object written");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
