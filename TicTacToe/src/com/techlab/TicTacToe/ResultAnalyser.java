package com.techlab.TicTacToe;

public class ResultAnalyser {

	public GameState hasWon(Game game) {
		if ((isFirstHorizontal(game.board)) || (isSecondHorizontal(game.board)) || (isThirdHorizontal(game.board))
				|| (isFirstVertical(game.board)) || (isSecondVertical(game.board)) || (isThirdVertical(game.board))
				|| (isFirstDiagonal(game.board)) || (isSecondDiagonal(game.board))) {
			return GameState.WIN;
		} else if (game.board.isFull()) {
			return GameState.DRAW;
		} else {
			return GameState.PLAYING;
		}
	}

	public boolean isFirstHorizontal(Board board) {
		Boolean result = Mark.EMPTY != board.getCellMark(0) && board.getCellMark(0) == board.getCellMark(1)
				&& board.getCellMark(1) == board.getCellMark(2);
		return result;
	}

	public boolean isSecondHorizontal(Board board) {
		Boolean result = Mark.EMPTY != board.getCellMark(3) && board.getCellMark(3) == board.getCellMark(4)
				&& board.getCellMark(4) == board.getCellMark(5);
		return result;
	}

	public boolean isThirdHorizontal(Board board) {
		Boolean result = Mark.EMPTY != board.getCellMark(6) && board.getCellMark(6) == board.getCellMark(7)
				&& board.getCellMark(7) == board.getCellMark(8);
		return result;
	}

	public boolean isFirstVertical(Board board) {
		Boolean result = Mark.EMPTY != board.getCellMark(0) && board.getCellMark(0) == board.getCellMark(3)
				&& board.getCellMark(3) == board.getCellMark(6);
		return result;
	}

	public boolean isSecondVertical(Board board) {
		Boolean result = Mark.EMPTY != board.getCellMark(1) && board.getCellMark(1) == board.getCellMark(4)
				&& board.getCellMark(4) == board.getCellMark(7);
		return result;
	}

	public boolean isThirdVertical(Board board) {
		Boolean result = Mark.EMPTY != board.getCellMark(2) && board.getCellMark(2) == board.getCellMark(5)
				&& board.getCellMark(5) == board.getCellMark(8);
		return result;
	}

	public boolean isFirstDiagonal(Board board) {
		boolean result = Mark.EMPTY != board.getCellMark(0) && board.getCellMark(0) == board.getCellMark(4)
				&& board.getCellMark(4) == board.getCellMark(8);
		return result;
	}

	public boolean isSecondDiagonal(Board board) {
		Boolean result = Mark.EMPTY != board.getCellMark(2) && board.getCellMark(2) == board.getCellMark(4)
				&& board.getCellMark(4) == board.getCellMark(6);
		return result;
	}

}
