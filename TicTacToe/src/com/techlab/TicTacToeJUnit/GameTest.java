package com.techlab.TicTacToeJUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlab.TicTacToe.Game;
import com.techlab.TicTacToe.GameState;
import com.techlab.TicTacToe.Mark;
import com.techlab.TicTacToe.Player;

public class GameTest {
	Player player1 = new Player();
	Player player2 = new Player();
	Game game = new Game(player1, player2);

	@Test
	public void testSwitchPlayer1() {
		Player player = player2;
		game.setCurrentPlayer(player1);
		assertEquals(player, game.switchPlayer());
	}

	@Test
	public void testSwitchPlayer2() {
		Player player = player1;
		game.setCurrentPlayer(player2);
		assertEquals(player, game.switchPlayer());
	}

	@Test
	public void testGamePlay() {
		assertEquals(GameState.PLAYING, game.play(0));
	}

	@Test
	public void testGamePlayInvalid() {
		game.play(0);
		assertEquals(GameState.INVALID, game.play(0));
	}

	@Test
	public void testGetMarkPlayer1() {
		game.setCurrentPlayer(player1);
		assertEquals(Mark.CROSS, game.getMark());
	}

	@Test
	public void testGetMarkPlayer2() {
		game.setCurrentPlayer(player2);
		assertEquals(Mark.NOUGHT, game.getMark());
	}

	@Test
	public void testGetMarkNull() {
		game.setCurrentPlayer(new Player());
		assertEquals(Mark.EMPTY, game.getMark());
	}

}
