package com.felicityinfo.appOne.been;

public class StudentsFactory {
	//
	private static StudentsFactory stuFactory = new StudentsFactory();
	
	
	
	public static StudentsFactory getStudentsFactory() {
        return stuFactory;
    }
	
	public String getSomeObject(int stuNo) {
		return " student object with "+ stuNo + "is given";
		
	}
}
