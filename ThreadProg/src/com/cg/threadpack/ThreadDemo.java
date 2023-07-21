package com.cg.threadpack;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t=Thread.currentThread();
		PrintMessage pm=new PrintMessage();
		//System.out.println(t);
		//t.setName("Main Thread");
		//System.out.println(t);
		for(int i=0;i<10;i++) {
			System.out.println("Welcome!");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
