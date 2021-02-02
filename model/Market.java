package com.tactfactory.designpatternniveau1.factory.tp1.model;

public class Market implements Building {

	private String name;
	
	public Market() {
		name = "Market";
	}
	
	@Override
	public String toString() {
		return name;
	}
}
