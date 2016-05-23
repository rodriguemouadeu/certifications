package com.rodriguemouadeu.javacert.associate.mock.enthuware;

class OverloadingTest {

	   public void test(){
	        test1(10);   //1
	        test1(10, 20); //2
	   }

	   //insert method here.

//		 public void test1(int i, int... j){}

		 public void test1(int... i){
			 for(int value : i){
				 System.out.println(i+"");
			 }
		 }

		 public static void main(String[] args){
			     new OverloadingTest().test();
	   }
}
