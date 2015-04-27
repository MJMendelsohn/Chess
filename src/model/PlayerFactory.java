package model;

public class PlayerFactory {
	
	public static Player createPlayer(int id) {
		return new Player(id);
	}
}
