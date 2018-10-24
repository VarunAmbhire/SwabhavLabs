package com.techlabs.player.test;

import com.techlabs.player.Player;

public class PlayerTest {

	public static void main(String[] args) {
		Player player=new Player("asas", 24);
		Player player1=new Player("aeww",18);
		Player player2=new Player("kih", 28);
		
		System.out.println(player.getPlayerID());
		System.out.println(player1.getPlayerID());
		System.out.println(player1.getPlayerID());		
		System.out.println(player2.getPlayerID());
		System.out.println(player1.getPlayerID());
		
	}

}
