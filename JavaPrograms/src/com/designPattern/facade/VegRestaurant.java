package com.designPattern.facade;

public class VegRestaurant implements Hotel{

	@Override
	public Menus getMenus() {
		// TODO Auto-generated method stub
		VegMenu v= new VegMenu();
		
		return v;
	}

}
