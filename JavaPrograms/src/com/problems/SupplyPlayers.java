package com.problems;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import com.designPattern.strategy.FootBallPlayer;
import com.designPattern.strategy.Player;
import com.designPattern.strategy.SnookerPlayer;
import com.designPattern.strategy.TennisPlayer;

public class SupplyPlayers {
	private static  Map<String, SupplyPlayer> plMap = null;

	static {
		plMap = new HashMap<>();
		plMap.put("TENNIS", TennisPlayer::new);
		plMap.put("FOOTBALL", FootBallPlayer::new);
		plMap.put("SNOOKER", SnookerPlayer::new);
		
	}

	public Player supplyPlayer(String playerType) throws IllegalAccessException {

		SupplyPlayer player = plMap.get(playerType);
		if (player == null) {
			throw new IllegalAccessException("Invalid player type" + playerType);
		}
		return (Player) player;
	}
}

