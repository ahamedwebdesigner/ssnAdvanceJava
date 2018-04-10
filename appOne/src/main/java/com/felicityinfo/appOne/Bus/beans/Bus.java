package com.felicityinfo.appOne.Bus.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
//@Service
//@Repository
public class Bus {
	public int serviceNo;
	public String form;
	public String to;

	@Autowired
	public Driver driver;
	
	
	
	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Bus() {
		super();
		this.serviceNo = 9897;
		this.form = "Bangalore";
		this.to = "Anantapur";
	}

	public Bus(int serviceNo, String form, String to) {
		super();
		
	}

	public int getServiceNo() {
		return serviceNo;
	}

	public void setServiceNo(int serviceNo) {
		this.serviceNo = serviceNo;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	@Override
	public String toString() {
		return "Bus [serviceNo=" + serviceNo + ", form=" + form + ", to=" + to + ", driver=" + driver + "]";
	}



}
