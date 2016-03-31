package com.rodriguemouadeu.javacert.associate.chapter5;

class LabeledBreakStatement {


	public static void main(String[] args){
	
		String[] programmers = {"Outer", "Inner"};

		
		outer:	
		for(String outer : programmers){
			
			inner:
			for(String inner : programmers){

				if(inner.equals("Inner"))
					break outer;
				
				System.out.println(inner + ":");

			}


		}
	
	}

}
