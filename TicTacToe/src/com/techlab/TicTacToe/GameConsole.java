package com.techlab.TicTacToe;

import java.util.Scanner;

public class GameConsole {

	public static void main(String[] args) {
		String playerName1, playerName2;
		Display display = new Display();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st Player Name : ");
		playerName1 = scanner.nextLine();
		Player player1 = new Player();
		player1.setPlayerName(playerName1);

		System.out.println("Enter 2nd Player Name : ");
		playerName2 = scanner.nextLine();
		Player player2 = new Player();
		player2.setPlayerName(playerName2);

		Game game = new Game(player1, player2);

		int number;

		while (!game.board.isFull()) {
			number = scanner.nextInt();
			if (number < 0 || number > 8) {
				System.out.println("invalid number");
			} else {
				System.out.println(game.getCurrentPlayer().getPlayerName() + " turn " + game.play(number));
				System.out.println(display.console(game.board));
			}
		}
	}

}
