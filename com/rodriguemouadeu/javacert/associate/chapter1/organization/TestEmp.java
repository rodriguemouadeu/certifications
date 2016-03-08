package com.rodriguemouadeu.javacert.associate.chapter1.organization;

import com.rodriguemouadeu.javacert.associate.chapter1.organization.Emp;

public class TestEmp{

	public static void main(String args[]){
	
		Emp emp1 = new Emp();
		emp1.bankVault = 10;
		Emp emp2 = new Emp();

		System.out.println(emp1.bankVault);
		System.out.println(emp2.bankVault);
		System.out.println(Emp.bankVault);		

		emp2.bankVault = 20;
		System.out.println("After emp2 was modified ...");
		System.out.println(emp1.bankVault);
		System.out.println(emp2.bankVault);
		System.out.println(Emp.bankVault);
	
	}	

}
