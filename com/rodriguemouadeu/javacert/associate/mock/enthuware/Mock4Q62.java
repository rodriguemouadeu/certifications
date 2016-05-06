package com.rodriguemouadeu.javacert.associate.mock.enthuware;

class A{
 	public double m1(int a){
   		return a*10/4-30;
 	}
}

class A2 extends A{
	 public double m1(int a){
  	 return a*10/4.0;
 	}
}

public class Mock4Q62 {
	
	public static void main(String... args){
		A2 a2 = new A2();
		System.out.println(a2.m1(10));	
	}

}
