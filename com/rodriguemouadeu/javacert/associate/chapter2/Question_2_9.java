package com.rodriguemouadeu.javacert.associate.chapter2;


public class Question_2_9 {

	public static void main(String[] args) {
	
		int num1 = 12;
		float num2 = 17.8f;
		boolean eJavaResult = true;
		
		boolean returnValue = num1 >= 12 && num2 < 4.567 || eJavaResult == true;
		System.out.println(returnValue);

                returnValue = (num1 >= 12 && num2 < 4.567) || eJavaResult == true;
                System.out.println(returnValue);

                returnValue = num1 >= 12 && (num2 < 4.567 || eJavaResult == false);
                System.out.println(returnValue);




	}
}
