package com.wang.ORM;

import java.sql.Date;

public class Emp_info {

	private int id;
	private String ename;
	private int age;
	private double salary;
	private Date hireDate;
	private int deptid;

	public Emp_info() {
		super();
	}

	public Emp_info(String ename, int age, double salary) {
		super();
		this.ename = ename;
		this.age = age;
		this.salary = salary;
	}

	public Emp_info(int id, String ename, int age, double salary, Date hireDate, int deptid) {
		super();
		this.id = id;
		this.ename = ename;
		this.age = age;
		this.salary = salary;
		this.hireDate = hireDate;
		this.deptid = deptid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	
	@Override
	public String toString() {
		return ename+"->"+age+"->"+salary;
	}

}
