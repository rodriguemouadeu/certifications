package com.rodriguemouadeu.javacert.associate.mock.enthuware;

class PreAndPostIncrementTest {

   public static void main(String args[]){
      int i;
      int j;
      for (i = 0, j = 0 ; j < 1 ; ++j , i++){
         System.out.println( i + " " + j );
      }
      System.out.println( i + " " + j );
   }
}
