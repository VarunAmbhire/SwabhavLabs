package com.techlab.TicTacToeJUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlab.TicTacToe.Cell;
import com.techlab.TicTacToe.Mark;

public class CellTest {

	Cell cell = new Cell();

	@Test
	public void testCellMark() {
		cell.setMark(Mark.CROSS);
		assertEquals(Mark.CROSS, cell.getMark());
	}

}
