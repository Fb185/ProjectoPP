package models;

public class Autocarros {
  final int maxPassageiros;
  private int numeroPassageiros = 0;
  private boolean avaria;
  private float speed;

  public Autocarros(int maxPassageiros, float speed) {
    this.maxPassageiros = maxPassageiros;
    this.speed = speed;
  }

  public int getNumeroPassageiros() {
    return this.numeroPassageiros;
  }

  public boolean hasAvarai() {
    return this.avaria;
  }

  public float getSpeed() {
    return this.speed;
  }
}
