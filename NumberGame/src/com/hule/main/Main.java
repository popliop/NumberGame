package com.hule.main;

public class Main {

	public static void main(String[] args) {

		intit();
	}

	public static void intit() {
		Model model = new Model(15);
		View view = new View(model);
		view.setEnabled(true);
		view.setVisible(true);

		System.out.println("BoardSize: " + model.BoardSize());

		model.printBoard();
		System.out.println();
		

		model.choose(1, 1);
		model.choose(3, 3);
		model.printBoard();

		// Controll controll = new Controll();

	}

}
