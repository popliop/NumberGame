package com.hule.main;

public class Model {

	// Fields
	private int row, col;
	private int[][] boardSize;
	private int summa;

	// Constructor

	public Model(int wantedSize) {
		this.row = wantedSize;
		this.col = wantedSize;

		createBoard(wantedSize);

	}

	// Methods

	public void createBoard(int wantedSize) {
		boardSize = new int[wantedSize][wantedSize];
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {
				boardSize[r][c] = (int) (Math.random() * 90 + 10);
			}
		}
	}

	public int BoardSize() {
		return boardSize.length;
	}

	public void printBoard() {

		for (int i = 0; i < BoardSize(); i++) {
			System.out.println();
			for (int j = 0; j < BoardSize(); j++) {
				System.out.print(" " + getNumber(i, j));
			}
		}
	}

	public int getNumber(int row, int col) {
		return boardSize[row][col];
	}

	public void choose(int row, int col) {
		boardSize[row][col] = 0;

		/* do what??
		 setJbutton enabled 0
		
				 
		 */
	}

	public int getSum() {
		return summa;
	}

	public boolean isBlocked(int row, int col) {
		if (boardSize[row][col] == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isFree(int row, int col) {

		if (boardSize[row][col] > 1) {
			return true;
		} else {
			return false;
		}

	}

	public boolean isChoosen(int row, int col) {
		return false;
	}

	public void addObserver(View w) {
		// Spara vyn, så vi kan anropa dess update när det är dags.
	}

}
