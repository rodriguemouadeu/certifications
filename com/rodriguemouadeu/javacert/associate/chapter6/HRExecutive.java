package com.rodriguemouadeu.javacert.associate.chapter6;

import java.util.Arrays;

class HRExecutive extends Employee implements Interviewer {

	String[] specializations;

	public void conductInterview(){
		System.out.println("HRExecutive - conductInterview");
	}

}
