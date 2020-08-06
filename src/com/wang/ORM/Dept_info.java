package com.wang.ORM;

public class Dept_info {
	private int id;
	private String dname;
	private String address;

	public Dept_info() {
		super();
	}

	public Dept_info(int id, String dname, String address) {
		super();
		this.id = id;
		this.dname = dname;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
}
