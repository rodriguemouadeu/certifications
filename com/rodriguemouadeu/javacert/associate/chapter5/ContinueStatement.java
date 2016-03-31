package com.rodriguemouadeu.javacert.associate.chapter5;

class ContinueStatement {


	public static void main(String[] args){
	
		String[] programmers = {"Paul", "Shreya", "Selvan", "Harry"};
	
		for(String name : programmers){
		
			if(name.equals("Shreya"))
				continue;
				
			System.out.println(name + ":");

		}
	
	}

}
