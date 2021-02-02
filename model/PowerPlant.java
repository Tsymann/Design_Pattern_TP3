package com.tactfactory.designpatternniveau1.factory.tp1.model;

public class PowerPlant implements Building {

	private String name;
	
	public PowerPlant() {
		name = "PowerPlant";
	}
	
	@Override
	public String toString() {
		return name;
	}
}
