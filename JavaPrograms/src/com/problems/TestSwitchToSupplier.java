package com.problems;

import com.designPattern.strategy.Player;

public class TestSwitchToSupplier {
public static void main(String[] args) throws IllegalAccessException {
PlayerSupplier playerSupplier= new PlayerSupplier();
Player snookerPlayer = playerSupplier.supplyPlayer("SNOOKER");
// Player rugbeePlayer = playerSupplier.supplyPlayer("RUGBEE");


}
}
