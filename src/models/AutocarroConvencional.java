package models;

public class AutocarroConvencional {
  final int maxPassageiros = 51;
  private int numeroPassageiros = 0;
  private boolean avaria = false;
  private float speed;

  public AutocarroConvencional() {
    System.out.println("Autocarro Convencional");
  }

  public int getNumeroPassageiros() {
    return this.numeroPassageiros;
  }

  // public boolean isFull() {
  // if(numeroPassageiros = maxPassageiros){
  // return true;
  // }
  // return () -> {
  // return numeroPassageiros = maxPassageiros;
  // };
  // }

  public float getSpeed() {
    return this.speed;
  }

  public boolean hasAvaria() {
    return this.avaria;
  }
}
