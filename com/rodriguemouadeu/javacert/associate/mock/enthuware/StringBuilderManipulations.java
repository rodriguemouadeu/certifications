package com.rodriguemouadeu.javacert.associate.mock.enthuware;

public class StringBuilderManipulations{

   public static void main(String[] args){

     //method1();

     //method2();

     method3();
   }

   static StringBuilder b1 = new StringBuilder("snorkler");
   static StringBuilder b2 = new StringBuilder("yoodler");

   static void resetStringBuilders(){
     b1 = new StringBuilder("snorkler");
     b2 = new StringBuilder("yoodler");
   }

   public static void method3(){
     resetStringBuilders();

     String sub1 = b2.substring(4);
     System.out.println("sub1 : " + sub1);

     String sub2 = b1.replace(3, 4, sub1).toString();
     System.out.println("sub2 : " + sub2);

     b2.append(false);
     System.out.println("b2.append(false) : " + b2);

     b1.append(b2);
     System.out.println("b1.append(b2) : " + b1);

    // b1.replace(3, 4, b2.substring(4)).append(b2.append(false));
    // System.out.println("b1 : " + b1 + ", b2 : " + b2);

   }

    public static void method2(){
      resetStringBuilders();

      b2.insert(3, b1.append("a"));
      System.out.println("b1 : " + b1 + ", b2 : " + b2);
    }

   public static void method1(){
     resetStringBuilders();

     b1.append(b2.substring(2,5 ).toUpperCase());
     System.out.println("b1 : " + b1 + ", b2 : " + b2);
   }
}
