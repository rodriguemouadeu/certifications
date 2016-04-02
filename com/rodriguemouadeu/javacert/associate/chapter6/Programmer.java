package com.rodriguemouadeu.javacert.associate.chapter6;

import java.util.Arrays;

class Programmer extends Employee implements Trainable, MobileAppExpert {

	String name = "Programmer"; 
	
	Programmer() {
	}

	Programmer(String val) {
		name = val;
	 }

	String getName(){
		return name;
	} 

	public void attendTraining(String[] trainingSchedules){
		System.out.println("Prog - attendTraining: " 
			+ (trainingSchedules != null 
				? Arrays.toString(trainingSchedules) : "No training"));
	}

	public void printName(){
		System.out.println(name);
	}

	public void startProjectWork(){
		defineClasses();
		unitTestCode();
	}

	private void defineClasses(){
		System.out.println("define classes");
	}
	
	private void unitTestCode(){
		System.out.println("unit test code");
	}

	public void deliverMobileApp(){
		System.out.println("testing complete on real device");
	}

}
