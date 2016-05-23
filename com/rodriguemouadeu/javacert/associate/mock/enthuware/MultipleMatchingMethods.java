package com.rodriguemouadeu.javacert.associate.mock.enthuware;

public class MultipleMatchingMethods{
   public void test(){
		    System.out.println("test1(10, 20) : ");
				test1(10, 20);  //1
				System.out.println("test1(10) : ");
				test1(10);  //2
				//System.out.println("test1() : ");
				//test1();  //3
	}

   public void test1(int i, int... j){ System.out.println("1"); }

	 //public void test1(int... i ){ System.out.println("2"); }

	 public void test1(int i, int j){ System.out.println("3"); }

   public static void main(String[] args){
     new MultipleMatchingMethods().test();
   }
}
