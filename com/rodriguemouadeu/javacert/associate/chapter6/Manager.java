package com.rodriguemouadeu.javacert.associate.chapter6;

import java.util.Arrays;

class Manager extends Employee implements Trainable, Interviewer {


	String getName(){
		return name;
	} 

	public void attendTraining(String[] trainingSchedules){
		System.out.println("Mgr - attendTraining: " 
			+ (trainingSchedules != null 
				? Arrays.toString(trainingSchedules) : "Nothing dude..."));
	}

	public void conductInterview(){
		System.out.println("Mgr - conductInterview");
	}
	

}
