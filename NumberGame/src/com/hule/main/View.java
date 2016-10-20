/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hule.main;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Hule
 */
public class View extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Model model;
	int size;
	JFrame frame = new JFrame();
	int row, col;
	JButton knapp[][];
	JPanel panGame;

	public View(Model model) {
		// Konstruktor och model ska anropa denna metoden när ett drag görs

		this.model = model;
		this.size = model.BoardSize();
		knapp = new JButton[size][size];
		
		
		panGame = new JPanel(new GridLayout(size, size));
		Container container = getContentPane();
		container.setLayout(new BorderLayout());
		container.add(panGame, "Center");
		

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				knapp[i][j] = new JButton("" + model.getNumber(i, j));
				knapp[i][j].setSize(10, 10);
				knapp[i][j].setEnabled(true);
				knapp[i][j].setVisible(true);
				panGame.add(knapp[i][j]);
				pack();
			}
		}

	}

	public void update() {
		// få in värden och update spelbordet grafiskt

	}
}
