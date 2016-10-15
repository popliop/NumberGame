package com.hule.main;

public class Model {
	private int Size;
	private int row, col;
	private int[][] boardSize;
	private int summa;

	public Model(int wantedSize) {
		this.row = wantedSize;
		this.col = wantedSize;
		boardSize = new int[row][col];

		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {
				boardSize[r][c] = (int) (Math.random() * 90 + 10);

			}
		}
	}

	public int BoardSize() {
		return boardSize.length;
	}

	public int getNumber(int row, int col) {
		return boardSize[row][col];
	}

	public void choose(int row, int col) {
		boardSize[row][col] = 0;

	}
	// Till�tna v�rden �r 1.. boardSize()
	// sen n�r modellen �ndrats skall View informeras!

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

		if (boardSize[row][col] == 1) {
			return true;
		} else {
			return false;
		}

	}

	public boolean isChoosen(int row, int col) {
		return false;
	}

	public void addObserver(View w) {
		// Spara vyn, s� vi kan anropa dess update n�r det �r dags.
	}

}
