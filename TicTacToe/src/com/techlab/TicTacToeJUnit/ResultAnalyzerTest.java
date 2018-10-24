package com.techlab.TicTacToeJUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlab.TicTacToe.Board;
import com.techlab.TicTacToe.Game;
import com.techlab.TicTacToe.GameState;
import com.techlab.TicTacToe.Mark;
import com.techlab.TicTacToe.Player;
import com.techlab.TicTacToe.ResultAnalyser;

public class ResultAnalyzerTest {
	ResultAnalyser resultAnalyser = new ResultAnalyser();
	Mark mark = Mark.CROSS;
	Player player1, player2;
	Game game = new Game(player1, player2);
	Board board = game.board;

	@Test
	public void testHasWonWin() {
		board.setCellMark(0, mark);
		board.setCellMark(1, mark);
		board.setCellMark(2, mark);
		assertEquals(GameState.WIN, resultAnalyser.hasWon(game));
	}

	@Test
	public void testHasWonDraw() {
		board.setCellMark(0, mark);
		board.setCellMark(1, mark.NOUGHT);
		board.setCellMark(2, mark.NOUGHT);
		board.setCellMark(3, mark.NOUGHT);
		board.setCellMark(4, mark);
		board.setCellMark(5, mark);
		board.setCellMark(6, mark.NOUGHT);
		board.setCellMark(7, mark);
		board.setCellMark(8, mark.NOUGHT);	
		 assertEquals(GameState.DRAW, resultAnalyser.hasWon(game));
	}

	@Test
	public void testHasWonPlaying() {
		assertEquals(GameState.PLAYING, resultAnalyser.hasWon(game));
	}

	@Test
	public void testResultAnalyzerFirstHorizontal() {
		board.setCellMark(0, mark);
		board.setCellMark(1, mark);
		board.setCellMark(2, mark);
		assertEquals(true, resultAnalyser.isFirstHorizontal(board));
	}

	@Test
	public void testResultAnalyzerFirstHorizontalFalse() {
		assertEquals(false, resultAnalyser.isFirstHorizontal(board));
	}

	@Test
	public void testResultAnalyzerSecondHorizontal() {
		board.setCellMark(3, mark);
		board.setCellMark(4, mark);
		board.setCellMark(5, mark);
		assertEquals(true, resultAnalyser.isSecondHorizontal(board));
	}

	@Test
	public void testResultAnalyzerSecondHorizontalFalse() {
		assertEquals(false, resultAnalyser.isSecondHorizontal(board));
	}

	@Test
	public void testResultAnalyzerThirdHorizontal() {
		board.setCellMark(6, mark);
		board.setCellMark(7, mark);
		board.setCellMark(8, mark);
		assertEquals(true, resultAnalyser.isThirdHorizontal(board));
	}

	@Test
	public void testResultAnalyzerThirdHorizontalFalse() {
		assertEquals(false, resultAnalyser.isThirdHorizontal(board));
	}

	@Test
	public void testResultAnalyzerFirstVertical() {
		board.setCellMark(0, mark);
		board.setCellMark(3, mark);
		board.setCellMark(6, mark);
		assertEquals(true, resultAnalyser.isFirstVertical(board));
	}

	@Test
	public void testResultAnalyzerFirstVerticalFalse() {
		assertEquals(false, resultAnalyser.isFirstVertical(board));
	}

	@Test
	public void testResultAnalyzerSecondVertical() {
		board.setCellMark(1, mark);
		board.setCellMark(4, mark);
		board.setCellMark(7, mark);
		assertEquals(true, resultAnalyser.isSecondVertical(board));
	}

	@Test
	public void testResultAnalyzerSecondVerticalFalse() {
		assertEquals(false, resultAnalyser.isSecondVertical(board));
	}

	@Test
	public void testResultAnalyzerThirdVerical() {
		board.setCellMark(2, mark);
		board.setCellMark(5, mark);
		board.setCellMark(8, mark);
		assertEquals(true, resultAnalyser.isThirdVertical(board));
	}

	@Test
	public void testResultAnalyzerThirdVericalFalse() {
		assertEquals(false, resultAnalyser.isThirdVertical(board));
	}

	@Test
	public void testResultAnalyzerFirstDiagonal() {
		board.setCellMark(0, mark);
		board.setCellMark(4, mark);
		board.setCellMark(8, mark);
		assertEquals(true, resultAnalyser.isFirstDiagonal(board));
	}

	@Test
	public void testResultAnalyzerFirstDiagonalFalse() {
		assertEquals(false, resultAnalyser.isFirstDiagonal(board));
	}

	@Test
	public void testResultAnalyzerSecondDiagonal() {
		board.setCellMark(2, mark);
		board.setCellMark(4, mark);
		board.setCellMark(6, mark);
		assertEquals(true, resultAnalyser.isSecondDiagonal(board));
	}

	@Test
	public void testResultAnalyzerSecondDiagonalFalse() {
		assertEquals(false, resultAnalyser.isSecondDiagonal(board));
	}

}
