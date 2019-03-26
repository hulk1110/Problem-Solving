package com.poc.anz;

public class Test {
public static void main(String[] args) {
	CreatePlayerCommand createCommand = new CreatePlayerCommand();
	Player snookerPlayer = createCommand.createPlayer("SNOOKER");
}
}
