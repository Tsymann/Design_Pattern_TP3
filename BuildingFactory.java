package com.tactfactory.designpatternniveau1.factory.tp1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.tactfactory.designpatternniveau1.factory.tp1.model.*;

public class BuildingFactory {

	public Building getBuilding(String buildingType){
		
	      if(buildingType == null){
	         return null;
	      }		
	      if(buildingType.equalsIgnoreCase("CITYHALL")){
	         return new CityHall();
	         
	      } else if(buildingType.equalsIgnoreCase("FIREDEPARTMENT")){
	         return new FireDepartment();
	         
	      } else if(buildingType.equalsIgnoreCase("HOUSE")){
	         return new House();
	         
	      } else if(buildingType.equalsIgnoreCase("MARKET")){
		     return new Market();
		     
	      } else if(buildingType.equalsIgnoreCase("POWERPLANT")){
			 return new PowerPlant();
			     
	      } else if(buildingType.equalsIgnoreCase("SCHOOL")){
			 return new School();
			     
	      } else if(buildingType.equalsIgnoreCase("WATERTOWER")){
			 return new WaterTower();
			     
	      }
	      
	      Random rdm = new Random();
	      List<String> buildingList = new ArrayList<String>();
	      buildingList.add("CITYHALL");
	      buildingList.add("FIREDEPARTMENT");
	      buildingList.add("HOUSE");
	      buildingList.add("MARKET");
	      buildingList.add("POWERPLANT");
	      buildingList.add("SCHOOL");
	      buildingList.add("WATERTOWER");
	       
	      String building = buildingList.get(rdm.nextInt(7));
	      
	      return getBuilding(building);
	   }
	
}
