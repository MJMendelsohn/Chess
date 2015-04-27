package model;

import java.util.ArrayList;
import java.util.List;

import model.boards.Board;
import model.player.Player;
import model.player.PlayerFactory;

public abstract class Game {
	
	Board myBoard;
	List<Player> myPlayers;
	Turn myTurn;
	
	public Game(int playerCount) {
		myBoard = BoardFactory.createBoard();
		createPlayers(playerCount);
	}
	
	private void createPlayers(int playerCount) {
		myPlayers = new ArrayList<Player>();
		for (int i = 0; i < playerCount; i++) {
			myPlayers.add(PlayerFactory.createPlayer(i));
		}
	}
	
}
