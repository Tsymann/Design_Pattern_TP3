package com.tactfactory.designpatternniveau1.factory.tp1.model;

public class WaterTower implements Building {

	private String name;
	
	public WaterTower() {
		name = "WaterTower";
	}
	
	@Override
	public String toString() {
		return name;
	}
}
