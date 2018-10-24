package com.techlab.TicTacToeJUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlab.TicTacToe.Board;
import com.techlab.TicTacToe.Mark;

public class BoardTest {
	Mark mark = Mark.CROSS;
	Board board = new Board();

	@Test
	public void testSetGetMarkCell() {
		board.setCellMark(1, mark);
		assertEquals(mark, board.getCellMark(1));
	}

	@Test
	public void testIsCellEmpty() {
		assertEquals(true, board.isCellEmpty(1));
	}

	@Test
	public void testIsCellEmptyFalse() {
		board.setCellMark(1, mark);
		assertEquals(false, board.isCellEmpty(1));
	}

	@Test
	public void testIsBoardFull() {
		for (int i = 0; i < 9; i++) {
			board.setCellMark(i, mark);
		}
		assertEquals(true, board.isFull());
	}

	@Test
	public void testIsBoardFullFalse() {
		assertEquals(false, board.isFull());
	}
}
