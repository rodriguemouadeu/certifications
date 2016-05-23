package com.rodriguemouadeu.javacert.associate.mock.enthuware;

class TrickyWhileTest {
	public static void main(String[] args) throws Exception{
	   int i = 1, j = 10;
		 int iterationCount = 0;
		 do {
	      if (i++ > --j) continue;
				System.out.println(iterationCount++ + ": i=" + i + " j=" + j);
	   } while (i < 5);
		 System.out.println("====== result ======");
	   System.out.println("i=" + i + " j=" + j);
	}
}
