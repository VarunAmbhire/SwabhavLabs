package com.techlab.TicTacToe;

public class Board {

	private Cell[] board = new Cell[9];

	public Board() {
		for (int index = 0; index < board.length; index++) {
			board[index] = new Cell();
			board[index].setMark(Mark.EMPTY);
		}
	}

	public void setCellMark(int cellIndex, Mark mark) {
		board[cellIndex].setMark(mark);
	}

	public Mark getCellMark(int cellIndex) {
		return board[cellIndex].getMark();
	}

	public boolean isCellEmpty(int cellIndex) {
		if (getCellMark(cellIndex) == Mark.EMPTY)
			return true;
		return false;
	}

	public boolean isFull() {
		for (int index = 0; index < 9; index++) {
			if (board[index].getMark() == Mark.EMPTY) {
				return false;
			}
		}
		return true;

	}

}
