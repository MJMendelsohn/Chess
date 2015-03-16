package model;

import java.util.List;
import java.util.Set;

public abstract class Board {
	
	List<List<Piece>> myBoard;
	
	public abstract List<Piece> getRow(int row);
	
	public abstract List<Piece> getCol(int col);
	
	public abstract Set<Piece> getLivePieces();
	
	public abstract Set<Piece> getDeadPieces();
	
}
