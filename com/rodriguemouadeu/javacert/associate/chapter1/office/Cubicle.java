package com.rodriguemouadeu.javacert.associate.chapter1.office;

import com.rodriguemouadeu.javacert.associate.chapter1.home.LivingRoom;

public class Cubicle {

	LivingRoom livingRoom;

	public Cubicle(String color){
		livingRoom = new LivingRoom(color);
	}

	public void showLivingRoomColor(){
		System.out.println("The livingroom is painted in " + livingRoom.getColor());
	}
}
