package com.rodriguemouadeu.javacert.associate.chapter6;

class Office {

	public static void main(String[] args) {

		String[] trainingSchedules = {"Time management", "Change mangement"};

		Programmer programmer = new Programmer("Harry");
		programmer.attendTraining(trainingSchedules);

		Manager manager = new Manager();
		manager.attendTraining(trainingSchedules);
		manager.conductInterview();
		
		HRExecutive hrExecutive = new HRExecutive();
		hrExecutive.specializations = new String[]{"Staffing"}; 
		System.out.println(hrExecutive.specializations[0]);

		hrExecutive.name = "Pavni Gupta";		
		System.out.println(hrExecutive.name);
		
		hrExecutive.conductInterview();

	}


}
