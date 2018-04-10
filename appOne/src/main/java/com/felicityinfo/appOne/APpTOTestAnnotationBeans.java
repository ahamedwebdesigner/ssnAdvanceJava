package com.felicityinfo.appOne;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.felicityinfo.appOne.Bus.BusConfig;
import com.felicityinfo.appOne.Bus.beans.Bus;

public class APpTOTestAnnotationBeans {

	public static void main(String[] args) {
		
		//1 xml configuration
	/*
    	ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] {"bus-config.xml"});
    	Bus b1 = (Bus) ctx.getBean("bus");
    	
    	System.out.println("===========================================");
	   	   String[] beanDef = ctx.getBeanDefinitionNames();
	    	for(String i : beanDef) {
	    		System.out.println(i);
	    	}
    	
    	System.out.println("===========================================");
    	System.out.println(b1);
    	*/
    	
/*    	Driver d1 = (Driver) ctx.getBean("Driver_one");
    	System.out.println(d1);*/
    	
		
		//2 java config
		
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(BusConfig.class);
		String[] beanDef = ctx.getBeanDefinitionNames();
		System.out.println("========================= java conig\n\n");
    	for(String i : beanDef) {
    		System.out.println(i);
    	}
    	
    	Bus b2 = (Bus) ctx.getBean("bus");
    	System.out.println(b2);
		
    
	}

}
