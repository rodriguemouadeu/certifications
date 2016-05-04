package com.rodriguemouadeu.javacert.associate.mock.enthuware;

class Mock4q25 {

static void crazyLoop(){
  int c = 0;
  JACK: while (c < 8){
    JILL: System.out.println(c);
    if (c > 3) break JACK; else c++;
  }
}
   public static void main(String args[ ] ){
   	crazyLoop();
   }
}
