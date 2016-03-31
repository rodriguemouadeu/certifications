package com.rodriguemouadeu.javacert.associate.chapter5;

class Loop3 {


	public static void main(String[] args){
		int i = 10;
		do
			while(i++ < 15){
				System.out.println("before: " + i);
				i = i + 20;
				System.out.println("after: " + i);
			}
	
		while (i < 2);
		System.out.println(i);
	}
	
}





