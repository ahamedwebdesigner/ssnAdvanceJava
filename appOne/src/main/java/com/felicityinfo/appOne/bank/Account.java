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
		AccountNO = accountNO;
		AccountType = accountType;
	}
	
	







	@Override
	public String toString() {
		return "Account [AccountNO=" + AccountNO + ", AccountType=" + AccountType + "]";
	}
	
	
	
}
