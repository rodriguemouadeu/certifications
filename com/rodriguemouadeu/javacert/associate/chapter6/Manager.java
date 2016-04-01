package com.rodriguemouadeu.javacert.associate.chapter6;

import java.util.Arrays;

class Manager extends Employee implements Trainable, Interviewer {

	int teamSize;

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
	
	public void startProjectWork(){
		meetWithCustomer();
		defineProjectSchedule();
		assignRespToTeam();
	}

	private void meetWithCustomer(){
		System.out.println("meet with customer");
	}
	private void defineProjectSchedule(){
		System.out.println("define project schedule");
	}
	private void assignRespToTeam(){
		System.out.println("team work starts");
	}

}
