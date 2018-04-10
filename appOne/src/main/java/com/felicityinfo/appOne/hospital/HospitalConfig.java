package com.felicityinfo.appOne.hospital;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.felicityinfo.appOne.hospital.bean.Docter;
import com.felicityinfo.appOne.hospital.bean.Hospital;

@Configuration
public class HospitalConfig {

	 @Bean(name ="GeneralDocter",
		   initMethod="init_method",
		   destroyMethod="destroy_method")
	 public Docter getDocter(){
		Docter d1 =  new Docter("Jack Nicksen");
				d1.setId(989);
	      return d1;
	   }
	 
	 @Bean()
	 public Hospital getHospital() {
		 Hospital h1 = new Hospital(getDocter());
		 h1.setHname("APOLO");
		 return h1;
	 }
	
	
	
}
