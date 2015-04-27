package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Game {
	
	Board myBoard;
	List<Player> myPlayers;
	Turn myTurn;
	
	public Game(int playerCount) {
		myBoard = BoardFactory.createBoard();	
	}
	
	private void createPlayers(int playerCount) {
		myPlayers = new ArrayList<Player>();
		for (int i = 0; i < playerCount; i++) {
			myPlayers.add(PlayerFactory.createPlayer(i));
		}
	}
	
}
