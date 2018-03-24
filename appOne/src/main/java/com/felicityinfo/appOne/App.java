package com.felicityinfo.appOne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.felicityinfo.appOne.been.Hellow;

public class App 
{
    public static void main( String[] args )
    {
        
    	//2
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
    	
    	
    	
    	Hellow h1 =  ctx.getBean("hellowMessageBean",Hellow.class);
    	//System.out.println(h1.getMessage());
    	System.out.println("==========h1============");
    	System.out.println(h1.getMsg());
    	
    	Hellow h2 = ctx.getBean("HelloMessageGenerater",Hellow.class);
    	System.out.println("==========h2============");
    	System.out.println(h2.getMsg());
    	
    	
    	
    	
    	/*
    	 *1)normal way
    	 * Hellow fisertmessage = new Hellow();
    	   System.out.println(fisertmessage.getMessage());*/
    	
    }
}
