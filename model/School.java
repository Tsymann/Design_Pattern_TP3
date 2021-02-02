package com.tactfactory.designpatternniveau1.factory.tp1.model;

public class School implements Building {

	private String name;
	
	public School() {
		name = "School";
	}
	
	@Override
	public String toString() {
		return name;
	}
}
