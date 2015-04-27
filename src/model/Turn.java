package model;

import model.player.Player;

public class Turn {
	
	private Player myActive;
	private int myCount;
	
	public boolean checkActive(Player player) {
		return myActive.equals(player);
	}
	
	public void setActive(Player player) {
		myActive = player;
	}
	
	public void updateTurn(Player player) {
		setActive(player);
		
	}
	
	public void incrementCount() {
		myCount++;
	}
	
}
