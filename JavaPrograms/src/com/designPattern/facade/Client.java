package com.designPattern.facade;

public class Client {
public static void main(String[] args) {
	HotelKeeper hotelKeeper= new HotelKeeper();
	
	VegMenu vegMenu= hotelKeeper.getVegMenu();
	System.out.println("hotel kepper helped me to to get"+ vegMenu.givemenu());
	NonVegMenu nonVegMenu= hotelKeeper.getNonVegMenu();
	System.out.println("hotel kepper helped me to to get "+ nonVegMenu.givemenu());
	Both both= hotelKeeper.getVegNonMenu();
	System.out.println("hotel kepper helped me to to get"+ both.givemenu());
}
}
