package com.techlab.TicTacToe;

public class Display {

	public String console(Board board) {
		String result = board.getCellMark(0) + " | " + board.getCellMark(1) + " | " + board.getCellMark(2) + "\n"
				+ "----------\n" + board.getCellMark(3) + " | " + board.getCellMark(4) + " | " + board.getCellMark(5)
				+ "\n" + "----------\n" + board.getCellMark(6) + " | " + board.getCellMark(7) + " | "
				+ board.getCellMark(8) + "\n";

		return result;
	}
}
