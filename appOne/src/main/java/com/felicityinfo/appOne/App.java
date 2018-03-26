package com.felicityinfo.appOne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.felicityinfo.appOne.been.Hellow;
import com.felicityinfo.appOne.school.User;
import com.felicityinfo.appOne.school.assets.Printer;

public class App 
{
    public static void main( String[] args )
    {
        
    	//2
    	ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] {"application-context.xml",
    																			  "School-context.xml",
    																			  "assets.xml"});
    	
    	
    	
    	Hellow h1 =  ctx.getBean("hellowMessageBean",Hellow.class);
    	//System.out.println(h1.getMessage());
    	System.out.println("==========h1============");
    	System.out.println(h1.getMsg());
    	
    	Hellow h2 = ctx.getBean("HelloMessageGenerater",Hellow.class);
    	System.out.println("==========h2============");
    	System.out.println(h2.getMsg());
    	
    	//TODO: create one student
    	User student1 = (User) ctx.getBean("studentBean");
    	student1.setName("mike");
    	student1.setStudentClass("ssc");
    	
    	System.out.println("==========student 1============");
    	System.out.println(student1);
    	
    	
    	//TODO: create one more teacher
    	User teachingStaff1 = (User) ctx.getBean("teachstaffBean");
    	teachingStaff1.setName("scoot");
    	teachingStaff1.setStudentClass("inter1");
    	
    	System.out.println("==========teachingStaff1 1============");
    	System.out.println(teachingStaff1);
    	
    	
    	//TODO: create one more accont
    	User accojntStaff1 = (User) ctx.getBean("accountstaffBean");
    	accojntStaff1.setName("blis");
    	accojntStaff1.setStudentClass("Btec");
    	
    	System.out.println("==========accojntStaff1 1============");
    	System.out.println(accojntStaff1);
    	
    	
    	//-------------------------------------------
    	Printer printer1= (Printer) ctx.getBean("printer");
    	System.out.println("==========printer============");
    	printer1.printBook();
    	
    	
    	
    	/*
    	 *1)normal way
    	 * Hellow fisertmessage = new Hellow();
    	   System.out.println(fisertmessage.getMessage());*/
    	
    }
}
