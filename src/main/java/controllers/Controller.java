package controllers;

import java.util.HashMap;

import models.*;

public class Controller {
  HashMap<Integer, Autocarros> busMap = new HashMap<Integer, Autocarros>();
  private int busID = 0;

  HashMap<String, Cidade> cidades = new HashMap<String, Cidade>();

  public void listBus() {
    busMap.forEach((k, v) -> System.out.println("key: " + k + " | value: " + v));
  }

  public void createConvencional() {
    Autocarros autocarroConvencional = new Autocarros(51, 1); // Autocarros(MAXPAX, SPEED)
    busID++;
    busMap.put(busID, autocarroConvencional);
    // autocarroConvencional.start();
    System.out.println("Autocarro Convencional Ligado");
  }

  public void createExpresso() {
    Autocarros autocarroExpresso = new Autocarros(69, 9);
    busID++;
    busMap.put(busID, autocarroExpresso);
    // autocarroExpresso.start();
    System.out.println("Autocarro Expresso Ligado");
  }

  public void createMiniBus() {
    Autocarros autocarroMiniBus = new Autocarros(24, 3);
    busID++;
    busMap.put(busID, autocarroMiniBus);
    // autocarroMiniBus.start();
    System.out.println("Autocarro Mini-Bus Ligado");
  }

  public void createLongDrive() {
    Autocarros autocarroLongDrive = new Autocarros(59, 14);
    busID++;
    busMap.put(busID, autocarroLongDrive);
    // autocarroLongDrive.start();
    System.out.println("Autocarro Long Drive Ligado");
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
