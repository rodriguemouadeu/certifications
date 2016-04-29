package com.rodriguemouadeu.javacert.associate.mock.enthuware;

class Mock2q14 {

	public static void main(String[] args){
		int count =0, sum = 0;
		do {
			if(count%3 == 0) {
				System.out.println(count + ":" + sum);
				continue;
			}	
			sum += count;
		} while(count++ < 11);	
       		System.out.println( "Sum:" + sum );
   	}

}
