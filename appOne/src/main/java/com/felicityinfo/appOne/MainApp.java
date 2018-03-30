package com.felicityinfo.appOne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.felicityinfo.appOne.been.StudentsFactory;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context-beans.xml");
			
		StudentsFactory sf = ctx.getBean("StudentsFactory",StudentsFactory.class);
		System.out.println(sf.getSomeObject(3000));
	}

}
