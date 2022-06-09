package controllers;

import java.util.HashMap;

import models.*;

public class Controller {
  private int busID;
  HashMap<Integer, AutocarroExpresso> expressoMap = new HashMap<Integer, AutocarroExpresso>();
  HashMap<Integer, AutocarroLongDrive> longDriveMap = new HashMap<Integer, AutocarroLongDrive>();
  HashMap<Integer, AutocarroMiniBus> miniBusMap = new HashMap<Integer, AutocarroMiniBus>();

  HashMap<String, Cidade> cidades = new HashMap<String, Cidade>();

  public void createConvencionalLisboa(int quantity) {
    for (int i = 0; i < quantity; i++) {

      AutocarroConvencional newConvencional = new AutocarroConvencional("Lisboa");

      // autocarroConvencional.start();
      System.out.println("Autocarro Convencional Ligado");
    }
  }

  public void createCascais(int passageiros) {
    Cascais cascais = new Cascais(passageiros);
  }

  public void createLisboa(int passageiros) {
    Lisboa lisboa = new Lisboa(passageiros);
  }

  public void createExpressoLisboa(int quantity) {
    for (int i = 0; i < quantity; i++) {
      Autocarros autocarroExpresso = new Autocarros(69, 9, "Lisboa");
      busID++;
      busMap.put(busID, autocarroExpresso);
      // autocarroExpresso.start();
      System.out.println("Autocarro Expresso Ligado");
    }
  }

  public void createMiniBusLisboa(int quantity) {
    for (int i = 0; i < quantity; i++) {
      Autocarros autocarroMiniBus = new Autocarros(24, 3, "Lisboa");
      busID++;
      busMap.put(busID, autocarroMiniBus);
      // autocarroMiniBus.start();
      System.out.println("Autocarro Mini-Bus Ligado");
    }
  }

  public void createLongDriveLisboa(int quantity) {
    for (int i = 0; i < quantity; i++) {
      Autocarros autocarroLongDrive = new Autocarros(59, 14, "Lisboa");
      busID++;
      busMap.put(busID, autocarroLongDrive);
      // autocarroLongDrive.start();
      System.out.println("Autocarro Long Drive Ligado");
    }
  }

  public void createConvencionalCascais(int quantity) {
    for (int i = 0; i < quantity; i++) {
      Autocarros autocarroConvencional = new Autocarros(51, 1, "Cascais");
      busID++;
      busMap.put(busID, autocarroConvencional);
      // autocarroConvencional.start();
      System.out.println("Autocarro Convencional Ligado");
    }
  }

  public void createExpressoCascais(int quantity) {
    for (int i = 0; i < quantity; i++) {
      Autocarros autocarroExpresso = new Autocarros(69, 9, "Cascais");
      busID++;
      busMap.put(busID, autocarroExpresso);
      // autocarroExpresso.start();
      System.out.println("Autocarro Expresso Ligado");
    }
  }

  public void createMiniBusCascais(int quantity) {
    for (int i = 0; i < quantity; i++) {
      Autocarros autocarroMiniBus = new Autocarros(24, 3, "Cascais");
      busID++;
      busMap.put(busID, autocarroMiniBus);
      // autocarroMiniBus.start();
      System.out.println("Autocarro Mini-Bus Ligado");
    }
  }

  public void createLongDriveCascais(int quantity) {
    for (int i = 0; i < quantity; i++) {
      Autocarros autocarroLongDrive = new Autocarros(59, 14, "Cascais");
      busID++;
      busMap.put(busID, autocarroLongDrive);
      // autocarroLongDrive.start();
      System.out.println("Autocarro Long Drive Ligado");
    }
  }

  public void createConvencionalCoimbra(int quantity) {
    for (int i = 0; i < quantity; i++) {
      Autocarros autocarroConvencional = new Autocarros(51, 1, "Coimbra"); // Autocarros(MAXPAX, S, "CoimbraPEED)
      busID++;
      busMap.put(busID, autocarroConvencional);
      // autocarroConvencional.start();
      System.out.println("Autocarro Convencional Ligado");
    }
  }

  public void createExpressoCoimbra(int quantity) {
    for (int i = 0; i < quantity; i++) {
      Autocarros autocarroExpresso = new Autocarros(69, 9, "Coimbra");
      busID++;
      busMap.put(busID, autocarroExpresso);
      // autocarroExpresso.start();
      System.out.println("Autocarro Expresso Ligado");
    }
  }

  public void createMiniBusCoimbra(int quantity) {
    for (int i = 0; i < quantity; i++) {
      Autocarros autocarroMiniBus = new Autocarros(24, 3, "Coimbra");
      busID++;
      busMap.put(busID, autocarroMiniBus);
      // autocarroMiniBus.start();
      System.out.println("Autocarro Mini-Bus Ligado");
    }
  }

  public void createLongDriveCoimbra(int quantity) {
    for (int i = 0; i < quantity; i++) {
      Autocarros autocarroLongDrive = new Autocarros(59, 14, "Coimbra");
      busID++;
      busMap.put(busID, autocarroLongDrive);
      // autocarroLongDrive.start();
      System.out.println("Autocarro Long Drive Ligado");
    }
  }

  public void createConvencionalPorto(int quantity) {
    for (int i = 0; i < quantity; i++) {
      Autocarros autocarroConvencional = new Autocarros(51, 1, "Porto"); // Autocarros(MAXPAX, SPEED, "Porto")
      busID++;
      busMap.put(busID, autocarroConvencional);
      // autocarroConvencional.start();
      System.out.println("Autocarro Convencional Ligado");
    }
  }

  public void createExpressoPorto(int quantity) {
    for (int i = 0; i < quantity; i++) {
      Autocarros autocarroExpresso = new Autocarros(69, 9, "Porto");
      busID++;
      busMap.put(busID, autocarroExpresso);
      // autocarroExpresso.start();
      System.out.println("Autocarro Expresso Ligado");
    }
  }

  public void createMiniBusPorto(int quantity) {
    for (int i = 0; i < quantity; i++) {
      Autocarros autocarroMiniBus = new Autocarros(24, 3, "Porto");
      busID++;
      busMap.put(busID, autocarroMiniBus);
      // autocarroMiniBus.start();
      System.out.println("Autocarro Mini-Bus Ligado");
    }
  }

  public void createLongDrivePorto(int quantity) {
    for (int i = 0; i < quantity; i++) {
      Autocarros autocarroLongDrive = new Autocarros(59, 14, "Porto");
      busID++;
      busMap.put(busID, autocarroLongDrive);
      // autocarroLongDrive.start();
      System.out.println("Autocarro Long Drive Ligado");
    }
  }

  public void createConvencionalBraga(int quantity) {
    for (int i = 0; i < quantity; i++) {
      Autocarros autocarroConvencional = new Autocarros(51, 1, "Braga"); // Autocarros(MAXPAX, SPEED, "Braga")
      busID++;
      busMap.put(busID, autocarroConvencional);
      // autocarroConvencional.start();
      System.out.println("Autocarro Convencional Ligado");
    }
  }

  public void createExpressoBraga(int quantity) {
    for (int i = 0; i < quantity; i++) {
      Autocarros autocarroExpresso = new Autocarros(69, 9, "Braga");
      busID++;
      busMap.put(busID, autocarroExpresso);
      // autocarroExpresso.start();
      System.out.println("Autocarro Expresso Ligado");
    }
  }

  public void createMiniBusBraga(int quantity) {
    for (int i = 0; i < quantity; i++) {
      Autocarros autocarroMiniBus = new Autocarros(24, 3, "Braga");
      busID++;
      busMap.put(busID, autocarroMiniBus);
      // autocarroMiniBus.start();
      System.out.println("Autocarro Mini-Bus Ligado");
    }
  }

  public void createLongDriveBraga(int quantity) {
    for (int i = 0; i < quantity; i++) {
      Autocarros autocarroLongDrive = new Autocarros(59, 14, "Braga");
      busID++;
      busMap.put(busID, autocarroLongDrive);
      // autocarroLongDrive.start();
      System.out.println("Autocarro Long Drive Ligado");
    }
  }

  public void listBus() {
    busMap.forEach((k, v) -> System.out.println("key: " + k + " | value: " + v));
  }

  public void getAllpax() {
    busMap.forEach((k, v) -> System.out.println("Bus: " + k + " | Passageiros: " + v.getNumeroPassageiros()));
  }

  public void getAllAvaria() {
    busMap.forEach((k, v) -> System.out.println("Bus: " + k + " | Avaria: " + v.hasAvaria()));
  }

  public void getAllSpeed() { // returns the speeds of all busses
    busMap.forEach((k, v) -> System.out.println("Bus: " + k + " | Speed: " + v.getSpeed()));
  }

  public void getAllLocation() { // returns the speeds of all busses
    busMap.forEach((k, v) -> System.out.println("Bus: " + k + " | Location: " + v.getCurrentLocation()));
  }

  public float getPax(int busID) {
    // System.out.println("GETSPEED DEBUG");
    return busMap.get(busID).getNumeroPassageiros();
  }

  public boolean hasAvaria(int busID) {
    // System.out.println("HASAVARIA DEBUG");
    return busMap.get(busID).hasAvaria();
  }

  public float getSpeed(int busID) {
    // System.out.println("GETSPEED DEBUG");
    return busMap.get(busID).getSpeed();
  }

  public String getCurrentLocation(int busID) {
    return busMap.get(busID).getCurrentLocation();
  }

}
