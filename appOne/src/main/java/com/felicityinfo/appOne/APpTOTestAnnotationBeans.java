package com.felicityinfo.appOne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.felicityinfo.appOne.Bus.beans.Bus;

public class APpTOTestAnnotationBeans {

	public static void main(String[] args) {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] {"bus-config.xml"});
    	//Bus b1 = (Bus) ctx.getBean("Bus");
    	
    	String[] beanDef = ctx.getBeanDefinitionNames();
    	for(String i : beanDef) {
    		System.out.println(i);
    	}
    	
    	System.out.println();
    	//System.out.println(b1);
	}

}
