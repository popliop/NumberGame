package com.hule.main;

public class Main {

	public static void main(String[] args) {

		intit();
	}

	public static void intit() {
		Model model = new Model(9);
		View view = new View(model);
		view.setEnabled(true);
		view.setVisible(true);

		System.out.println("BoardSize: " + model.boardSize());

		model.printBoard();
		System.out.println();
		
		

		
		model.choose(3, 3);
		model.printBoard();
		model.addObserver(view);

		// Controll controll = new Controll();

	}

}
