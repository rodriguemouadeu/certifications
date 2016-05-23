package com.rodriguemouadeu.javacert.associate.mock.enthuware;

class A{
  public A() { System.out.println("A's constructor ..."); } // A1
  public A(String s) {  this();  System.out.println("A :"+s);  }  // A2
}

class B extends A{
  public B() { System.out.println("B's constructor ..."); } // A1
  public int B(String s) {  System.out.println("B :"+s);  return 0; } // B1
}

class C extends B{
  private C(){ super();  System.out.println("C's constructor ..."); } // C1
  public C(String s){  this();  System.out.println("C :"+s);  } // C2
  public C(int i){} // C3
}

public class WorkingWithConstructorsInheritance {

   public static void main(String[] args){
     //C c1 = new C(5);

     C c2 = new C("Hello world");
  }
}
