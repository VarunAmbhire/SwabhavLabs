package com.techlab.TicTacToe;

public class Game {
	public Board board = new Board();
	private Player player1, player2;
	private Player currentPlayer;

	ResultAnalyser resultAnalyser = new ResultAnalyser();

	public Game(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
		currentPlayer = player1;
	}

	public GameState play(int numOfCell) {
		if (board.isCellEmpty(numOfCell)) {
			board.setCellMark(numOfCell, getMark());
			switchPlayer();
			return resultAnalyser.hasWon(this);
		} else {
			return GameState.INVALID;
		}
	}

	public Player switchPlayer() {
		if (getCurrentPlayer()==player1) {
			setCurrentPlayer(player2);
			return player2;
		} else {
			setCurrentPlayer(player1);
			return player1;
		}
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	public Mark getMark() {
		if (getCurrentPlayer().equals(player1))
			return Mark.CROSS;
		else if (getCurrentPlayer().equals(player2))
			return Mark.NOUGHT;
		return Mark.EMPTY;
	}

}
