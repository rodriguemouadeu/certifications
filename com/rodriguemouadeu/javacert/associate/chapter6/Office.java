package com.rodriguemouadeu.javacert.associate.chapter6;

class Office {

	public static void main(String[] args) {

		String[] trainingSchedules = {"Time management", "Change mangement"};

		Programmer programmer = new Programmer("Harry");
		programmer.attendTraining(trainingSchedules);

		Manager manager = new Manager();
		manager.attendTraining(trainingSchedules);
		manager.conductInterview();
		

	}


}
