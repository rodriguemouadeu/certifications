package com.rodriguemouadeu.javacert.associate.mock.enthuware;

class FinallyTest {

   public static void main(String args[]){
     System.out.println(new FinallyTest().parseFloat(args[0]));
   }

  public static float parseFloat( String s ){
     float f = 0.0f;
     try{
        f = Float.valueOf( s ).floatValue();
        return f ;
     }
     catch(NumberFormatException nfe){
        f = Float.NaN ;
        return f;
     }
     finally{
        f = 10.0f;
        return f;
     }
  }
}
