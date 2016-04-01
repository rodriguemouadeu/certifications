package com.rodriguemouadeu.javacert.associate.chapter6;

class Office {

	public static void main(String[] args) {

		Interviewer emp = new HRExecutive();
		emp.specializations = new String[]{"Staffing"}; 
		System.out.println(emp.specializations[0]);

		emp.name = "Pavni Gupta";		
		System.out.println(emp.name);
		
		emp.conductInterview();

	}


}
