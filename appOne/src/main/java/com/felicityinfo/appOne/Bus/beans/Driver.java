package com.felicityinfo.appOne.Bus.beans;

public class Driver {
	public String Name;
	public String Id;
	public Driver() {
		super();
	}
	public Driver(String name, String id) {
		super();
		Name = name;
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	@Override
	public String toString() {
		return "Driver [Name=" + Name + ", Id=" + Id + "]";
	}
	
	

}
