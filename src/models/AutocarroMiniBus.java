package models;

class AutocarroMiniBus {
  final int maxPassageiros = 24;
  private int numeroPassagerios = 0;
  private boolean avaria = false;
  private float speed;

  public AutocarroMiniBus() {
    System.out.println("Autocarro Mini bus");
  }

  public int getNumeroPassageiros() {
    return this.numeroPassagerios;
  }

  public float getSpeed() {
    return this.speed;
  }

  public boolean hasAvaria() {
    return this.avaria;
  }

  public void startEngine() {
    System.out.println("Engine Started");
  }
}
