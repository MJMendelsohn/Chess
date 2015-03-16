package model;

import java.util.List;
import java.util.Set;

public abstract class Piece {
	
	Pair myPosition;
	Player myPlayer;
	
	public abstract Set<Pair> getLegalMoves(List<List<Piece>> board);
	
	public void updateLocation(Pair position) {
		myPosition = position;
	}
	
}
