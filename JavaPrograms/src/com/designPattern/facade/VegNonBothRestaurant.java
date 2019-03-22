package com.designPattern.facade;

public class VegNonBothRestaurant implements Hotel{

	@Override
	public Menus getMenus() {
		// TODO Auto-generated method stub
		Both b= new Both();
		return b;
	}

}
