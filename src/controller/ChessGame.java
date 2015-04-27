package controller;

import model.BoardFactory;
import model.boards.Board;
import javafx.application.Application;
import javafx.stage.Stage;

public class ChessGame extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Board b = BoardFactory.createBoard();
		b.printBoard();
	
	}

	
	public static void main(String[] args) {
		launch(args);
	}
}
