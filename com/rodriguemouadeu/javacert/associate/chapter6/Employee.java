package com.rodriguemouadeu.javacert.associate.chapter6;

abstract class Employee {

 	String name;
	String address;
	protected String phoneNumber;
	public float experience;

	void reachOffice(){
			
		System.out.println("Reached office - Gurgon, India");	

	}
	
	public abstract void startProjectWork();
	
}
