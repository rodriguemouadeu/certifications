package com.rodriguemouadeu.javacert.associate.chapter1;

import com.rodriguemouadeu.javacert.associate.chapter1.office.Cubicle;

public class ImportMain {

	public static void main(String args[]){
		Cubicle cubicle = new Cubicle(args[0]);
		cubicle.showLivingRoomColor();
	}
}
