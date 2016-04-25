package com.rodriguemouadeu.javacert.associate.mock;

class Hospital {

	public static void main(String... args){

		Sergeon s1 = new Sergeon("Liver");
		Sergeon s2 = new Sergeon("Heart");
		s1.age = 45;
		System.out.println(s1.age + s2.getSpecialization());
	
	}

}
