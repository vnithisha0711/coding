package com.cg.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		FileReader fr=null;
		BufferedReader br=null; //read String line by line
		try {
			fr=new FileReader("C:\\angular22\\AbstractProg\\src\\Compartment.java");
			br=new BufferedReader(fr);
			String str=null;
			
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		}
		
		}
		


