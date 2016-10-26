package com.hule.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controll implements ActionListener {

	Model mod;
	View view;

	public Controll(Model mod) {

		this.mod = mod;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();

		mod.choose(Integer.valueOf(s.charAt(0)), Integer.valueOf(s.charAt(1)));
		
		System.out.println("ye");
	}
}
