package com.designPattern.facade;

public class NonVegRestaurant implements Hotel {

	@Override
	public Menus getMenus() {
		// TODO Auto-generated method stub
		NonVegMenu nvm = new NonVegMenu();
		return nvm;
	}

}
