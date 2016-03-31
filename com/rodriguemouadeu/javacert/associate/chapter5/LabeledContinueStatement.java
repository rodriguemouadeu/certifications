package com.rodriguemouadeu.javacert.associate.chapter5;

class LabeledContinueStatement {


	public static void main(String[] args){
	
		String[] programmers = {"Paul", "Shreya", "Selvan", "Harry"};
	
		Outer:
		for(String name1 : programmers){

			for (String name : programmers){
				if(name.equals("Shreya"))
					continue Outer;
				
				System.out.println(name + ":");
			}
		}
	
	}

}
