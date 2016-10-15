package com.hule.main;

public class Main {

	public static void main(String[] args) {

		intit();
	}

	public static void intit() {
		Model model = new Model(2);

		System.out.println("BoardSize: "+model.BoardSize());

		System.out.println(model.getNumber(1, 1));
		System.out.println(model.getNumber(0, 1));
		
		View view = new View();
		Controll controll = new Controll();

	}

}
