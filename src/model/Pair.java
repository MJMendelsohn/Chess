package model;

public class Pair {

	int myRow;
	int myCol;
	
	/***
	 * Pair represents coordinate in 2 dimensional space
	 * @param row
	 * @param col
	 */
	public Pair(int row, int col) {
		setLocation(row, col);
	}
	
	private void setLocation(int row, int col) {
		myRow = row;
		myCol = col;
	}
	
	public int getRow() {
		return myRow;
	}
	
	public int getCol() {
		return myCol;
	}
}
