package com.rodriguemouadeu.javacert.associate.mock.enthuware;

public class ShortCircuitingTest {

  static boolean a;
  static boolean b;
  static boolean c;


  public static void main(String[] args) throws Exception{
    boolean bool;
     //boolean bool = (a = true) || (b = true) && (c = true);
     //System.out.print("\n(a = true) || (b = true) && (c = true) : " + a + ", " + b + ", " + c);

     //bool = ((a = true) || (b = true)) && (c = true);
     //System.out.print("\n((a = true) || (b = true)) && (c = true) : " + a + ", " + b + ", " + c);

     bool = (a = true) && (b = true) || (c = true);
     System.out.print("\n(a = true) && (b = true) || (c = true) : " + a + ", " + b + ", " + c + "\n");

     Thread.sleep(2000);
  }
}
