package com.felicityinfo.appOne.hospital.bean;

public class Docter {
	public String name ;
	private int id;

	
	public Docter() {super();
	}

	public void init_method() {
		System.out.println("=====================Init method called ======================");
	}
	public void destroy_method() {
		System.out.println("=====================destroy_method method called ======================");
	}

	public Docter(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Docter [name=" + name + ", id=" + id + "]";
	}



	

}
