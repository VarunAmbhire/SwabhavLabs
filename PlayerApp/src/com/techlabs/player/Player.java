package com.techlabs.player;

public class Player {
	private static int id;
	private int playerID;
	private String playerName;
	private int playerAge;

	static {
		id = 100;
	}

	public Player(String playerName, int playerAge) {
		this.playerName = playerName;
		this.playerAge = playerAge;
		id++;
		playerID=id;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerAge() {
		return playerAge;
	}

	public void setPlayerAge(int playerAge) {
		this.playerAge = playerAge;
	}

	public int getPlayerID() {
		return playerID;
	}

}
