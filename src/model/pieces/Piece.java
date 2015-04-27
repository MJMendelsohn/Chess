package model.pieces;

import java.util.List;
import java.util.Observable;
import java.util.Set;

import model.Pair;
import model.player.Player;

public abstract class Piece extends Observable {
	
	private Pair myPosition;
	private Player myPlayer;
	
	public Piece(int row, int col) {
		myPosition = new Pair(row, col);
	}
	
	public abstract Set<Pair> getLegalMoves(List<List<Piece>> board);
	
	public void updateLocation(Pair position) {
		Pair prevPosition = myPosition;
		myPosition = position;
		setChanged();
		notifyObservers(prevPosition);
	}

	public Pair getPosition() {
		return myPosition;
	}
	
	@Override
	public String toString() {
		return "Piece";
	}
}
