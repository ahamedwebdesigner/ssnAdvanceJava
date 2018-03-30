package com.felicityinfo.appOne.been;

public class staffFactory {
	
	public NonTeachingStaff getNonteachingStaff() {
		
		// some logic will be excuited hear
		return new NonTeachingStaff();
		
	}
	
	public TeachingStaff getTeachingStaff() {
		// some logic will be excuited hear
		return new TeachingStaff();
		
	}

}
