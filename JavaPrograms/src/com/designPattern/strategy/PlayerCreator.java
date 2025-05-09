package com.designPattern.strategy;

public class PlayerCreator {

	public Player createPlayer(PlayerTypes playerTypes) {

		switch (playerTypes) {
		case TENNIS:

			return new TennisPlayer();

		case FOOTBALL:

			return new FootBallPlayer();

		case SNOOKER:

			return new SnookerPlayer();

		default:
			throw new IllegalArgumentException("Invalid player type: " + playerTypes);
		}
	}
}
