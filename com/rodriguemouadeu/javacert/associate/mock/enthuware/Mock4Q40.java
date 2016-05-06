package com.rodriguemouadeu.javacert.associate.mock.enthuware;

public class Mock4Q40{
   public static void main(String args[]) throws Exception{
       try{

          m1();
          System.out.println("A");

//        } catch (Exception e){
// 
//		System.out.println("ZZZZZ");
//
	} finally{

          	System.out.println("B");
        }

        System.out.println("C");

   }

   public static void m1() throws Exception { throw new Exception(); }
}
