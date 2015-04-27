package model.boards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

import model.Pair;
import model.pieces.Piece;

public abstract class Board implements Observer {
	
	private List<List<Piece>> myBoard;
	
	public Board(int rows, int cols) {
		createEmptyBoard(rows, cols);
	}
	
	private void createEmptyBoard(int rows, int cols) {
		myBoard = new ArrayList<List<Piece>>();
		for (int i = 0; i < rows; i++) {
			myBoard.add(new ArrayList<Piece>());
			for (int j = 0; j < cols; j++) {
				myBoard.get(i).add(null);
			}
		}
	}

	public List<Piece> getRow(int index) {
		List<Piece> row = myBoard.get(index);
		return Collections.unmodifiableList(row);
	}
	
	public List<Piece> getCol(int col) {
		throw new IllegalStateException("unimplemented getCol");		
	}
	
	public Set<Piece> getLivePieces() {
		throw new IllegalStateException("unimplemented getLivePieces");
	}
	
	public Set<Piece> getDeadPieces() {
		throw new IllegalStateException("unimplemented getDeadPieces");
	}
	
	/***
	 * Add piece to board without checks
	 * Location of piece added to 
	 * @param piece
	 */
	public void addPiece(Piece piece) {
		Pair position = piece.getPosition();
		myBoard.get(position.getRow()).set(position.getCol(), piece);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		try {
			Pair movedFrom = (Pair) arg;
			Piece piece = (Piece) o;
		}
		catch (Exception e) {
			throw new IllegalStateException("illegal pair");
		}
		
		
	}
	
	public abstract void initPieces();
	
	public void printBoard() {
		myBoard.forEach(row -> {row.forEach(piece -> System.out.print(piece + "\t"));
		System.out.println();});
	}
}
