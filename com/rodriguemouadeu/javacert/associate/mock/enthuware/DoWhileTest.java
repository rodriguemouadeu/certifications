package com.rodriguemouadeu.javacert.associate.mock.enthuware;

class DoWhileTest {

	public static void main(String[] args){

   int i=0, j=11;
   do{
      if(i > j) {
        break;
      }
      j--;
      System.out.println(i+"  "+j);
   }while( ++i < 5);
   System.out.println("========");
   System.out.println(i+"  "+j);
 }
}
