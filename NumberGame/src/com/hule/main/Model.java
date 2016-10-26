package com.hule.main;

public class Model {

	// Fields
	private int row, col;
	private int[][] spelPlan;
	private boolean[][] blocks;
	private int summa;
	boolean isFree = false;
	private final int iteamSize = 5;
	View w;

	// Constructor

	public Model(int wantedSize) {

		if (wantedSize < 1) {
			System.err.println("för lågt val");
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

		for (int i = 0; i < blocks.length + 1; i++) {

			for (int j = 0; i < spelPlan.length - 1; i++) {
				blocks[i][j] = true;
			}
		}

	}

	public int getSum() {
		return summa;
	}

	public boolean isblocked(int row, int col) {
		return blocks[row][col];
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
		this.w = w;
		w.update();
	}

}
