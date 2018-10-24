package com.techlab.TicTacToeJUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlab.TicTacToe.Board;
import com.techlab.TicTacToe.Display;

public class DisplayTest {
	Display display = new Display();
	Board board = new Board();

	@Test
	public void testConsole() {

		String result = board.getCellMark(0) + " | " + board.getCellMark(1) + " | " + board.getCellMark(2) + "\n"
				+ "----------\n" + board.getCellMark(3) + " | " + board.getCellMark(4) + " | " + board.getCellMark(5)
				+ "\n" + "----------\n" + board.getCellMark(6) + " | " + board.getCellMark(7) + " | "
				+ board.getCellMark(8) + "\n";
		;

		assertEquals(result, display.console(board));
	}
}
