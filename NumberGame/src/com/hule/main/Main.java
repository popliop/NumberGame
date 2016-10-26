package com.hule.main;

public class Main {

	public static void main(String[] args) {

		intit();
	}

	public static void intit() {
		Model model = new Model(4);
		View view = new View(model);
		view.setEnabled(true);
		view.setVisible(true);

		System.out.println("BoardSize: " + model.boardSize());

		model.printBoard();
		System.out.println();
		
		

		
		
		model.printBoard();
		

		// Controll controll = new Controll();

	}

}
