package models;

public class Autocarros extends Thread {
  final int maxPassageiros;
  private boolean moving = false;
  private int numeroPassageiros = 0;
  private boolean avaria = false;
  private float speed;
  private String currentLocation = "Cascais";

  @Override
  public void run() {
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

  public Autocarros(int maxPassageiros, float speed) {
    this.maxPassageiros = maxPassageiros;
    this.speed = speed;
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
