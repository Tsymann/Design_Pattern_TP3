package com.tactfactory.designpatternniveau1.factory.tp1.model;

public class CityHall implements Building {

	private String name;
	
	public CityHall() {
		name = "CityHall";
	}

	@Override
	public String toString() {
		return name;
	}
	
	
}
