package com.rodriguemouadeu.javacert.associate.mock;

class MEQ4 {

	public static void main(String... args){

		String name =null;
		int a = 10;

		try{
			a = name.length();
			a++;
		} catch(RuntimeException e){
			++a;
		}
		
		System.out.println(a);
	
	}

}
