package com.rodriguemouadeu.javacert.associate.chapter2.twistintale;

public class TwistInTaleLogicalOperators {

	
	public static void main(String[] args){
	
		int a = 10;
		int b = 20;
		int c = 40;

		System.out.println(a++ > 10 || ++b < 30);
		
		System.out.println(a > 90 && ++b < 30);
		
		System.out.println(!(c>20) && a == 10);
		
		System.out.println(a >= 99 && a <= 33 || b == 10);
		
	}

}
