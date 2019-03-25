package com.designPattern.strategy;

public class Test {
	public static void main(String[] args) {

		PlayerCreator creator = new PlayerCreator();
		Player tenisPlayer = creator.createPlayer(PlayerTypes.TENNIS);
		Player snookerPlayer = creator.createPlayer(PlayerTypes.SNOOKER);
		Player footballPlayer = creator.createPlayer(PlayerTypes.FOOTBALL);
		
	}
}
