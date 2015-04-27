package model;

public class BoardFactory {
	
	public static Board createBoard() {
		return new ChessBoard();
	}
}
