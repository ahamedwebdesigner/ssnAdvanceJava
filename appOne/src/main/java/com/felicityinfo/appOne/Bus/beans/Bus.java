package com.felicityinfo.appOne.Bus.beans;

import org.springframework.stereotype.Component;

@Component
public class Bus {
	public int serviceNo;
	public String form;
	public String to;

	
	
	public Bus() {
		super();
	}

	public Bus(int serviceNo, String form, String to) {
		super();
		this.serviceNo = 9897;
		this.form = "Bangalore";
		this.to = "Anantapur";
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
		return "Bud [serviceNo=" + serviceNo + ", form=" + form + ", to=" + to + "]";
	}

}
