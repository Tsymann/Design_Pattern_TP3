package com.tactfactory.designpatternniveau1.factory.tp1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.tactfactory.designpatternniveau1.factory.tp1.model.*;

/**
*
* @author tactfactory
*
* - Modifier le programme pour permettre de créer des Building au travers d'un design pattern "Factory" :
*   - 1 : Il existe 3 façon de créer des Building
*     - 1 : Créer aléatoirement pour toutes les classes du package courant qui implémente "Building", qui possède un
*         constructeur vide, qui sont publiques et qui ne sont pas abstraites
*     - 2 : Créer depuis une chaine de caractère qui représente le "simpleName" de la classe à utiliser qui implémente
*         "Building", qui possède un constructeur vide, qui est publique et qui n'est pas abstraite
*     - 3 : Depuis une classe qui implémente "Building", qui possède un constructeur vide, qui est publique et qui
*         n'est pas abstraite
*   - 2 : Créer deux listes de building dans le point d'entré de l'application
*     - 1 : La première liste doit contenir 20 Building généré aléatoirement
*     - 2 : La deuxième doit contenir au moins une fois chaque classe qui implémente "Building", qui possède un
*         constructeur vide, qui sont publiques et qui ne sont pas abstraites. En utilisant soit les chaine de
*         caractères ou les classes
*/
public class FactoryTp1 {

  public static void main(String[] args) {
    randomTown();
    System.out.println("---------------------------");
    manualTown();
  }

  
  
  
  private static void manualTown() {
	  BuildingFactory factory = new BuildingFactory();
	  List<Building> buildings = new ArrayList<Building>();
	  buildings.add(factory.getBuilding("CITYHALL"));
	  buildings.add(factory.getBuilding("FIREDEPARTMENT"));
	  buildings.add(factory.getBuilding("HOUSE"));
	  buildings.add(factory.getBuilding("MARKET"));
	  buildings.add(factory.getBuilding("POWERPLANT"));
	  buildings.add(factory.getBuilding("SCHOOL"));
	  buildings.add(factory.getBuilding("WATERTOWER"));
	  
	  for(Building build : buildings) {
		  System.out.println(build.toString());
	  }
	  
	  
  }

  private static void randomTown() {
	  
	  BuildingFactory factory = new BuildingFactory();
	  List<Building> buildings = new ArrayList<Building>();
	  
	  for(int i = 0; i < 20; i++) {
		  buildings.add(factory.getBuilding(" "));
	  }
	 
	  for(Building build : buildings) {
		  System.out.println(build.toString());
	  }
  }

}



/*

for (Class<?> klazz : ClassUtils.getClasses("com.tactfactory.designpatternniveau1.factory.tp1")) {

 

      if (klazz.getInterfaces().length > 0 && klazz.getInterfaces()[0].getName().equals(Building.class.getName())) {
        System.out.println(klazz.getName());
      }
    }
    
        public static void main(String[] args)
      throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException,
      IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

 

    List<Building> buildings = new ArrayList<>();

 

    for (Class<?> klazz : ClassUtils.getClasses("com.tactfactory.designpatternniveau1.factory.tp1")) {

 

      if (klazz.getInterfaces().length > 0 && klazz.getInterfaces()[0].getName().equals(Building.class.getName())) {
        System.out.println(klazz.getName());
        buildings.add((Building) klazz.getConstructor().newInstance());
      }
    }

 

    for (Building building : buildings) {
      System.out.println(building.getClass().getSimpleName());
    }

 

    randomTown();
    System.out.println("---------------------------");
    manualTown();
  }
  
  */
