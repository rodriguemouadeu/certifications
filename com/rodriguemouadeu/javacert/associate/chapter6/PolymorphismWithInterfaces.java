package com.rodriguemouadeu.javacert.associate.chapter6;

class PolymorphismWithInterfaces {

	public static void main(String[] args) {

		MobileAppExpert emp1 = new Programmer();
		MobileAppExpert emp2 = new Manager();

		emp1.deliverMobileApp();
		emp2.deliverMobileApp();
		
	}

}
