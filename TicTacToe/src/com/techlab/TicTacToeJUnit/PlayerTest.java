package com.techlab.TicTacToeJUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlab.TicTacToe.Player;

public class PlayerTest {
	Player player = new Player();

	@Test
	public void testPlayer() {
		player.setPlayerName("Marine");
		assertEquals("Marine", player.getPlayerName());
	}

}
