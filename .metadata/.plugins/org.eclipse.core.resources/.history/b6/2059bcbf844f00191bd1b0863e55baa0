package com.problems;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import com.designPattern.strategy.FootBallPlayer;
import com.designPattern.strategy.Player;
import com.designPattern.strategy.SnookerPlayer;
import com.designPattern.strategy.TennisPlayer;

// this program show how to hide /minimize switch statements 
public class PlayerSupplier {

	private static final Map<String, Supplier<Player>> PLAYER_SUPPLIER;

	static {
		final Map<String, Supplier<Player>> plMap = new HashMap<>();
		plMap.put("TENNIS", TennisPlayer::new);
		plMap.put("FOOTBALL", FootBallPlayer::new);
		plMap.put("SNOOKER", SnookerPlayer::new);
		PLAYER_SUPPLIER = Collections.unmodifiableMap(plMap);
	}

	public Player supplyPlayer(String playerType) throws IllegalAccessException {

		Supplier<Player> player = PLAYER_SUPPLIER.get(playerType);
		if (player == null) {
			throw new IllegalAccessException("Invalid player type" + playerType);
		}
		return player.get();
	}
}
