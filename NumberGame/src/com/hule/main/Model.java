package com.hule.main;

public class Model {

	// Fields
	private int row, col;
	private int[][] spelPlan;
	private boolean[][] blocks;
	private int summa;
	boolean isFree = false;
	private final int iteamSize = 5;

	// Constructor

	public Model(int wantedSize) {

		if (wantedSize < 1) {
			System.err.println("Var lågt val");
		} else {
			this.row = wantedSize;
			this.col = wantedSize;
		}

		createBoard(wantedSize);
	}

	// Methods

	public int getIteamSize() {

		return iteamSize;
	}

	public void createBoard(int wantedSize) {
		spelPlan = new int[wantedSize][wantedSize];
		blocks = new boolean[wantedSize][wantedSize];
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {
				spelPlan[r][c] = (int) (Math.random() * 90 + 10);
				blocks[r][c] = false;
			}
		}
	}

	public int boardSize() {
		return spelPlan.length;
	}

	public void printBoard() {

		for (int i = 0; i < boardSize(); i++) {
			System.out.println();
			for (int j = 0; j < boardSize(); j++) {
				System.out.print(" " + getNumber(i, j));
			}
		}
	}

	public int getNumber(int row, int col) {
		return spelPlan[row][col];
	}

	public void choose(int row, int col) {

		for (int i = 0; i < spelPlan.length; i++) {
			spelPlan[row][i] = 0;
		}

		for (int i = 0; i < spelPlan.length; i++) {
			spelPlan[i][col] = 0;
		}

	}

	public int getSum() {
		return summa;
	}

	public boolean isblocked(int row, int col) {
		if (spelPlan[row][col] == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isFree(int row, int col) {

		if (spelPlan[row][col] > 1) {
			return true;
		} else {
			return false;
		}

	}

	public boolean isChoosen(int row, int col) {
		return false;
	}

	public void addObserver(View w) {
		w.update();
	}

}
