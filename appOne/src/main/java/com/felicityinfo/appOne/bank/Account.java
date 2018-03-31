package com.felicityinfo.appOne.bank;

import com.felicityinfo.appOne.bank.user.BankUser;

public class Account {
	int AccountNO;
	String AccountType;
	BankUser bankUser;
	
	public Account() {
		super();
	}

	public Account(int accountNO, String accountType) {
		System.out.println("======> 2 arg constructor is called");
		AccountNO = accountNO;
		AccountType = accountType;
	}
	
	
	public Account( BankUser bankUser, int accountNO, String accountType) {
		super();
		System.out.println("3 arg constructor is called");
		AccountNO = accountNO;
		AccountType = accountType;
		this.bankUser = bankUser;
	}

	@Override
	public String toString() {
		return "Account [AccountNO=" + AccountNO + ", AccountType=" + AccountType + ", bankUser=" + bankUser + "]";
	}


	
	
}
