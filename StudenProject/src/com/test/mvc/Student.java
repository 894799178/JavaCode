package com.test.mvc;
public class Student {
	private String Name;
	private Integer age;
	private String emill;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmill() {
		return emill;
	}
	public void setEmill(String emill) {
		this.emill = emill;
	}
	
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", age=" + age + ", emill=" + emill + ", getName()=" + getName()
				+ ", getAge()=" + getAge() + ", getEmill()=" + getEmill() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Student(String name, Integer age, String emill) {
		Name = name;
		this.age = age;
		this.emill = emill;
	}
	public Student() {
	}

}
