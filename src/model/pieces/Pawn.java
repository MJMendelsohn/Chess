package model.pieces;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import model.Pair;

public class Pawn extends Piece {

	public Pawn(int row, int col) {
		super(row, col);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Set<Pair> getLegalMoves(List<List<Piece>> board) {

		return new HashSet<Pair>();
	}

	@Override
	public String toString() {
		return "P";
	}
}
