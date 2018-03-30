package com.felicityinfo.appOne.been;


// static factory
public class StudentsFactory {
	

	public static StudentsFactory getStudentsFactory() {
		// make a service call
		// make a database call
		// do soem logic 
        return new StudentsFactory();
    }
	
	public String getSomeObject(int stuNo) {
		return " student object with "+ stuNo + "is given";
		
	}
}
