package com.hule.main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Model {
	int Size;
	int row, col;
	int[][] boardSize = new int[row][col];
	
	int summa;

	public Model(int wantedSize) {
		this.row = wantedSize;
		this.col = wantedSize;

		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {
				System.out.println(c);
				boardSize[r][c] = (int) (Math.random() * 90 + 10);

			}

		}

	}

	public int[][] getBoardSize() {
		return boardSize;
	}

	public int getNumber(int row, int col) {
		return row + col;
	}

	public void choose(int row, int col) {
		// Rutan med dessa koordinater väljs som drag
	}
	// Tillåtna värden är 1.. boardSize()
	// sen när modellen ändrats skall View informeras!

	public int getSum() {
		return summa;
	}

	public boolean isBlocked(int row, int col) {
		// Returnerar true om rutan inte är valbar
	}

	public boolean isFree(int row, int col) {
		// Returnerar true om rutan är valbar
	}

	public boolean isChoosen(int row, int col) {
		// Returnerar true om rutan redan är vald
	}

	public void addObserver(View w) {
		// Spara vyn, så vi kan anropa dess update när det är dags.
	}

}
