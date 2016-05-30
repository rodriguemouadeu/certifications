package com.rodriguemouadeu.javacert.associate.mock.enthuware;
import java.lang.*;

public class StringBuilderDemo {

   public static void main(String[] args) {

   StringBuilder str = new StringBuilder("Java Util Package");
   System.out.println("string = " + str);

   // replace substring from index 5 to index 9
   str.replace(5, 6, "Lang");
   // prints the StringBuilder after replacing
   System.out.println("After replacing: " + str);
   }
}
