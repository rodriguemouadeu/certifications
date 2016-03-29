package com.rodriguemouadeu.javacert.associate.chapter4;


class BankAccount  {

	String accountNumber;
	int accountType;


	public boolean equals(Object anObject){

		System.out.println("Entering BankAccount.equals !!!");			

		if(anObject instanceof BankAccount){
			
			System.out.println("Is instance of BankAccount !!!");			

			BankAccount account = (BankAccount)anObject;

			System.out.println("anObject.toString: " + account.toString());

			return accountNumber.equals(account.accountNumber) &&
				accountType == account.accountType;			

		}
		
		System.out.println("Is NOT an instance of BankAccount !!!");			
		
		return false;

	}

	
	public String toString(){

		StringBuilder sb = new StringBuilder();	
		sb.append("accountNumber:"+accountNumber);
		sb.append("; accountType:"+accountType);
		
		return sb.toString();

	}

}

