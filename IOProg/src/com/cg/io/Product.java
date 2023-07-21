package com.cg.io;

import java.io.Serializable;

public class Product implements Serializable{
	private int pcode;
	private String pname;
	private int stock;
	public Product(int pcode, String pname, int stock) {
		super();
		this.pcode = pcode;
		this.pname = pname;
		this.stock = stock;
	}
	public int getPcode() {
		return pcode;
	}
	public void setPcode(int pcode) {
		this.pcode = pcode;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}

	
}
