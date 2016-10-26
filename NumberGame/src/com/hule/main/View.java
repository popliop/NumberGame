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
	Controll cont;
	int size = 5;
	JFrame frame = new JFrame();
	int row, col;
	JButton knapp[][];
	JPanel panGame;

	public View(Model model) {
		// Konstruktor och model ska anropa denna metoden n�r ett drag g�rs.

		this.model = model;
		this.size = model.boardSize();
		knapp = new JButton[size][size];

		panGame = new JPanel(new GridLayout(size, size));
		Container container = getContentPane();
		container.setLayout(new BorderLayout());
		container.add(panGame, "Center");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Number Game");
		skapaKnappar();

	}

	public void skapaKnappar() {
		cont = new Controll(model);
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				knapp[i][j] = new JButton("" + model.getNumber(i, j));
				knapp[i][j].setSize(10, 10);
				knapp[i][j].setEnabled(true);
				knapp[i][j].setVisible(true);
				knapp[i][j].addActionListener(cont);
				knapp[i][j].setActionCommand("" + i + j);
				panGame.add(knapp[i][j]);
				pack();
			}
		}

	}

	public void update() {
		// f�r in v�rden och update spelbordet grafiskt
		System.out.println("\n Working");

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {

				if (model.isblocked(i, j)) {
					knapp[i][j].setEnabled(false);
				}
			}
		}

	}
}
