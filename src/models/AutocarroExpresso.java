class AutocarroExpresso {
  final int maxPassageiros = 0;
  private int numeroPassageiros = 0;
  private boolean avaria = false;
  private float speed;

  AutocarroExpresso() {
    System.out.println("Autocarro Expresso");
  }

  public int getNumeroPassageiros() {
    return numeroPassageiros;
  }

  public float getSpeed() {
    return this.speed;
  }

  public boolean hasAvaria() {
    return this.avaria;
  }
}
