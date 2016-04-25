package com.rodriguemouadeu.javacert.associate.mock;

class MyExam {

	void question(){
		try{
			question();
		}catch(StackOverflowError e){
			System.out.println("Caught");
		}
	}
	
	public static void main(String... args){
		MyExam exam = new MyExam();
		exam.question();
	
	}

}
