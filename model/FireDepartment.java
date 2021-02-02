package com.tactfactory.designpatternniveau1.factory.tp1.model;

public class FireDepartment implements Building {

	private String name;
	
	public FireDepartment() {
		name = "FireDepartment";
	}
	
	@Override
	public String toString() {
		return name;
	}
}
