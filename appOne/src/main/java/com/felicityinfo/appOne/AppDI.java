package com.felicityinfo.appOne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.felicityinfo.appOne.bank.Account;

public class AppDI {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("defination-config.xml");
		Account ac1 = ctx.getBean("Account",Account.class);
		
		System.out.println("===============================\n\n\n\n");
		System.out.println(ac1);
		
		ctx.close();

	}

}
