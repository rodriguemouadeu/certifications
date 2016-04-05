package com.rodriguemouadeu.javacert.associate.chapter7;

class TestRiverRaftingNoException {

	public static void main(String[] args){
		
		RiverRafting riverRafting = new RiverRafting();
	
		try{
			riverRafting.crossRapid(7);
			riverRafting.rowRaft("Happy");
			System.out.println("Enjoy River Rafting");
	
		} catch (FallInRiverException e){
	
			System.out.println("Get back in the raft");
	
		} catch (DropOarException e1){
		
			System.out.println("Do not panic !!!");
		
		} finally {
	
			System.out.println("Pay for the sport");
	
		}
	
		System.out.println("After the try block");
	
	}
}
