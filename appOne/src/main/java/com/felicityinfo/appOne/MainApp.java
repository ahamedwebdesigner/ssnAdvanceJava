package com.felicityinfo.appOne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.felicityinfo.appOne.been.NonTeachingStaff;
import com.felicityinfo.appOne.been.StudentsFactory;
import com.felicityinfo.appOne.been.TeachingStaff;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context-beans.xml");
			
		System.out.println("===========================================================\n\n");
		StudentsFactory sf = ctx.getBean("StudentsFactory",StudentsFactory.class);
		System.out.println(sf.getSomeObject(3000));
		
		
		TeachingStaff ts = ctx.getBean("Teahingstaff",TeachingStaff.class);
		System.out.println(ts);
		
		
		NonTeachingStaff ns = ctx.getBean("noTeahingstaff",NonTeachingStaff.class);
		System.out.println(ns);
		
	}

}
