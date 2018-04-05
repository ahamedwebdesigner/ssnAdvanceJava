package com.felicityinfo.appOne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.felicityinfo.appOne.hospital.HospitalConfig;
import com.felicityinfo.appOne.hospital.bean.Docter;
import com.felicityinfo.appOne.hospital.bean.Hospital;

public class HospitalApp {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HospitalConfig.class);
		Docter doc1 = ctx.getBean("getDocter",Docter.class);
		System.out.println(doc1.name);
		
		Hospital h1 = ctx.getBean("getHospital",Hospital.class);
		System.out.println(h1);

	}

}
