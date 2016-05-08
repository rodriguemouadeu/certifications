package com.rodriguemouadeu.javacert.associate.mock.enthuware;

public class Mock5Q60 {
   	
	static int mx(int s){
		System.out.println(s);
		for(int i=0; i<3; i++){
			s = s + i;
			System.out.println(s);
		}
		return s;
	}

	public static void main(String[] args){
      		int s = 5;
		s += s +mx(s) + ++s;
		System.out.println(s);
   	}
}
