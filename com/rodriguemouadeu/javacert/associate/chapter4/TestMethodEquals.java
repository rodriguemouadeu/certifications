package com.rodriguemouadeu.javacert.associate.chapter4;

import java.util.*;

public class TestMethodEquals  {

	public static void main(String[] args){

		ArrayList<BankAccount> accounts = new ArrayList<>();

		BankAccount b1 = new BankAccount();
		b1.accountNumber = "0023490";
		b1.accountType = 4;
		accounts.add(b1);

		
		BankAccount b2 = new BankAccount();
		b2.accountNumber = "0023490";
		b2.accountType = 4;
		
		System.out.println(accounts.contains(b2));

		System.out.println("Hello from code !!!");
		
	}
}

