package com.rodriguemouadeu.javacert.associate.chapter6;

import java.util.Arrays;

class Programmer extends Employee implements Trainable {

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
}
