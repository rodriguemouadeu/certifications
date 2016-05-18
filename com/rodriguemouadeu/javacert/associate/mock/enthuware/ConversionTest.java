package com.rodriguemouadeu.javacert.associate.mock.enthuware;

class ConversionTest {

	public static void main(String[] args){
		int i = 1234567890;
		System.out.println("i = " + i);
		float f = i;
		System.out.println("f = " + f);
		System.out.println("i - f = " + (i - f));
		System.out.println("i - (int)f = " + (i - (int)f));
		//System.out.println(i - (int)f);
	}
}
