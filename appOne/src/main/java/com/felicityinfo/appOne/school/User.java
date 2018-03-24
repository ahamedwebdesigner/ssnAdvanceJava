package com.felicityinfo.appOne.school;

public class User {
	private String type;
	private String Name;
	private String studentClass;
	
	
	
	public User() {
		super();
	}

	public User(String type, String name, String studentClass) {
		super();
		this.type = type;
		Name = name;
		this.studentClass = studentClass;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	@Override
	public String toString() {
		return "user [type=" + type + ", Name=" + Name + ", studentClass=" + studentClass + "]";
	}
	
	
	

}
