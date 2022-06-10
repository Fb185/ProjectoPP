package models;

public class Autocarros {
  final int maxPassageiros;
  private int busID;
  private boolean moving = false;
  private int numeroPassageiros = 0;
  private boolean avaria = false;
  private int speed;
  private String currentLocation;

  public Autocarros(int maxPassageiros, int speed, String currentLocation, int busID) {
    this.maxPassageiros = maxPassageiros;
    this.speed = speed;
    this.currentLocation = currentLocation;
    this.busID = busID;
  }

  public int getBusID() {
    return this.busID;
  }

  public void setCurrentLocation(String currentLocation) {
    this.currentLocation = currentLocation;
  }

  public String getCurrentLocation() {
    if (this.moving) {
      return "Bus is on the move";
    } else {
      return currentLocation;
    }

  }

  public int getNumeroPassageiros() {
    return this.numeroPassageiros;
  }

  public boolean hasAvaria() {
    return this.avaria;
  }

  public float getSpeed() { // i am speed
    return this.speed;
  }

  public void addPassageiro() {
    this.numeroPassageiros++;
  }

  public void removePassageiro() {
    this.numeroPassageiros--;
  }

  public boolean isMoving() {
    return this.moving;
  }
}
