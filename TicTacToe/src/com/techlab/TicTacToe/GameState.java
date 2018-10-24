package com.techlab.TicTacToe;

public enum GameState {

	PLAYING, WIN, DRAW, INVALID;

	public String toString() {
		switch (this) {
		case PLAYING:
			return "Playing";
		case WIN:
			return "Win";
		case DRAW:
			return "Draw";
		case INVALID:
			return "Invalid Input";
		default:
			return null;
		}
	}
}
