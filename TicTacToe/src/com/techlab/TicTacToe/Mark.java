package com.techlab.TicTacToe;

public enum Mark {

	NOUGHT, CROSS, EMPTY;

	public String toString() {
		switch (this) {
		case NOUGHT:
			return "O";
		case CROSS:
			return "X";
		case EMPTY:
			return " ";
		default:
			return null;
		}
	}
}
