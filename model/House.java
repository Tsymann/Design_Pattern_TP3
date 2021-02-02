package com.tactfactory.designpatternniveau1.factory.tp1.model;

public class House implements Building {

	private String name;
	
	public House() {
		name = "House";
	}
	
	@Override
	public String toString() {
		return name;
	}
}
