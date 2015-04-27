package model;

import model.boards.Board;
import model.boards.ChessBoard;

public class BoardFactory {
	
	public static Board createBoard() {
		return new ChessBoard();
	}
}
