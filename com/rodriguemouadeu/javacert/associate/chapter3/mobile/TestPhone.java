package com.rodriguemouadeu.javacert.associate.chapter3.mobile;


class TestPhone {

	public static void main(String[] args){
	
		Phone.softKeyboard = false;
		Phone phone1 = new Phone();
		Phone phone2 = new Phone();

		System.out.println(phone1.softKeyboard);
		System.out.println(phone1.softKeyboard);

		Phone.softKeyboard = true;

		System.out.println(phone1.softKeyboard);
		System.out.println(phone1.softKeyboard);

	}


}


