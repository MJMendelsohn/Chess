package model;

import java.util.List;
import java.util.Observable;
import java.util.Set;

public abstract class Piece extends Observable {
	
	Pair myPosition;
	Player myPlayer;
	
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
	
}
