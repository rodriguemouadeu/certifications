package com.rodriguemouadeu.javacert.associate.chapter6;

class Employee {

 	String name = "Employee";
	String address;
	protected String phoneNumber;
	public float experience;

	void reachOffice(){
			
		System.out.println("Reached office - Gurgon, India");	

	}
	
	public void printName(){
		System.out.println(name);
	}

	//public abstract void startProjectWork();
	
}
