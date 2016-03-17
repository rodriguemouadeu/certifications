package com.rodriguemouadeu.javacert.associate.chapter2;


public class UnaryPostfixIncrement {

	public static void main(String[] args) {
	
		int a = 20;
		int b = 10;
		int c = a - b++;

		System.out.println(c);
		System.out.println(b);

	}

}
