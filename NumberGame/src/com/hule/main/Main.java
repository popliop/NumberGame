package com.hule.main;

public class Main {

	public static void main(String[] args) {

		intit();
	}

	public static void intit() {
		Model model = new Model(5);

		System.out.println("BoardSize: " + model.BoardSize());

		model.printBoard();

		//View view = new View();
		//Controll controll = new Controll();

	}

}
