class AutocarroLongDrive {
  final int maxPassageiros = 24;
  private int numeroPassageiros = 0;
  private boolean avaria = false;
  private float speed;

  AutocarroLongDrive() {
    System.out.println("Autocarro Long Drive");
  }

  public int getNumeroPassageiros() {
    return this.numeroPassageiros;
  }

  public float getSpeed() {
    return this.speed;
  }

  public boolean hasAvarai() {
    return this.avaria;
  }
}
