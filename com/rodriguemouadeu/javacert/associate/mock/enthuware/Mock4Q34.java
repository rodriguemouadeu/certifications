package com.rodriguemouadeu.javacert.associate.mock.enthuware;

class Super { 

	static String ID = "QBANK";
   	
//	Super(){System.out.println("Initializing Super"); }
}

class Sub extends Super{
   static { System.out.print("In Sub"); }

//   Sub(){System.out.println("Initializing Sub"); }
}

public class Mock4Q34 {
   public static void main(String[] args){
      System.out.println(Sub.ID);
   }
}
