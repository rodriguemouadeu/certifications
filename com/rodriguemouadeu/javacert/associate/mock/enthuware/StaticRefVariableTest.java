package com.rodriguemouadeu.javacert.associate.mock.enthuware;

class StaticRefVariableTest {

   static StaticRefVariableTest ref;
   String[] arguments;

   public static void main(String args[]){
     ref = new StaticRefVariableTest();
     ref.func(args);
   }

   public void func(String[] args){
     ref.arguments = args;
   }
 }
