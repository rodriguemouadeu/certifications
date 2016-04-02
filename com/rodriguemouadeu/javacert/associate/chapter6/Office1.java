package com.rodriguemouadeu.javacert.associate.chapter6;

class Office1 {

	public static void main(String[] args) {

		Employee emp = new Employee();
		Employee emp1 = new Programmer();
		Programmer programmer = new Programmer();

		System.out.println(emp.name);
		System.out.println(emp1.name);
		System.out.println(programmer.name);

		emp.printName();
		emp1.printName();
		programmer.printName();
	}


}
