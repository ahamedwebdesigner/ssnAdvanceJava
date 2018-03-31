package com.felicityinfo.appOne.bank.user;

public class BankUser {
	String userName;
	String address;
	
	
	
	public String getUserName() {
		return userName;
	}




	public void setUserName(String userName) {
		this.userName = userName;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	@Override
	public String toString() {
		return "BankUser [userName=" + userName + ", Address=" + address + "]";
	}





	

}
