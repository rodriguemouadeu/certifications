package com.rodriguemouadeu.javacert.associate.mock;

class ShoeFactory{
	ShoeFactory(Boot val){
		System.out.println("Boot");
	}
	
	ShoeFactory(Shoe val){
		System.out.println("Shoe");
	}
} 
