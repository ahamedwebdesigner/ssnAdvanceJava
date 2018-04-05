package com.felicityinfo.appOne.hospital.bean;

public class Hospital {
	public Docter d1;
	private String Hname;

	public Hospital(Docter d1) {
		this.d1 = d1;
	}

	public Hospital() {
		
	}

	public String getHname() {
		return Hname;
	}

	public void setHname(String hname) {
		Hname = hname;
	}

	@Override
	public String toString() {
		return "Hospital [d1=" + d1 + ", Hname=" + Hname + "]";
	}


	

}
