package com.felicityinfo.appOne.been;

public class Hellow {
	private String Msg;
	private String User;
	
	
	



	public Hellow(String user) {
		super();
		User = user;
	}


	public String getMsg() {
		return Msg +"    "+User;
	}


	public void setMsg(String msg) {
		Msg = msg;
	}


	public String getMessage() {
		return "Hellow world";
	}
	
	
}
