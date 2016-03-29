package com.rodriguemouadeu.javacert.associate.chapter3;

class EJavaGuruPassObjects1 {

	public static void main(String[] args){

		Person p = new Person();
		p.name = "EJava";		

		anotherMethod(p);
		System.out.println(p.name);


		someMethod(p);
		System.out.println(p.name);

	}

	private static void anotherMethod(Person p){
		p = new Person();
		p.name = "anotherMethod";
		System.out.println(p.name);

	}
	
	private static void someMethod(Person p){

		p.name = "someMethod";
		System.out.println(p.name);

	}

}
