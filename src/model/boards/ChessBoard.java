package model.boards;

import java.util.List;
import java.util.Observable;
import java.util.Set;

import model.pieces.Pawn;
import model.pieces.Piece;

public class ChessBoard extends Board {

	public ChessBoard() {
		super(8, 8);
		initPieces();
	}

	@Override
	public void initPieces() {
		Piece[] pieces =
			{
				new Pawn(1, 0),
				new Pawn(1, 1),	
				new Pawn(1, 2),	
				new Pawn(1, 3),	
				new Pawn(1, 4),	
				new Pawn(1, 5),	
				new Pawn(1, 6),	
				new Pawn(1, 7),
				new Pawn(6, 0),
				new Pawn(6, 1),	
				new Pawn(6, 2),	
				new Pawn(6, 3),	
				new Pawn(6, 4),	
				new Pawn(6, 5),	
				new Pawn(6, 6),	
				new Pawn(6, 7)
			};
		for (Piece p: pieces) {
			addPiece(p);
		}
		
	}

}
