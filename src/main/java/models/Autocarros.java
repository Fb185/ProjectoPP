package models;

public class Autocarros extends Thread {
  final int maxPassageiros;
  private int numeroPassageiros = 0;
  private boolean avaria;
  private float speed;

  @Override
  public void run() {
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
}
