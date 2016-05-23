package com.rodriguemouadeu.javacert.associate.mock.enthuware;

public class StringBuilderManipulations{

   public static void main(String[] args){

     method1();

     method2();

     method3();
   }

   public static void method3(){
     StringBuilder b1 = new StringBuilder("snorkler");
     StringBuilder b2 = new StringBuilder("yoodler");

     b1.replace(3, 4, b2.substring(4)).append(b2.append(false));
     System.out.println("b1 : " + b1 + ", b2 : " + b2);

   }

    public static void method2(){
      StringBuilder b1 = new StringBuilder("snorkler");
      StringBuilder b2 = new StringBuilder("yoodler");
      b2.insert(3, b1.append("a"));
      System.out.println("b1 : " + b1 + ", b2 : " + b2);
    }

   public static void method1(){
     StringBuilder b1 = new StringBuilder("snorkler");
     StringBuilder b2 = new StringBuilder("yoodler");

     b1.append(b2.substring(2,5 ).toUpperCase());
     System.out.println("b1 : " + b1 + ", b2 : " + b2);
   }
}
