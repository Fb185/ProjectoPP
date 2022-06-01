class AutocarroExpresso {
  final int maxPassageiros = 0;
  private int numeroPassageiros = 0;
  private boolean avaria = false;

  AutocarroExpresso() {
    System.out.println("Autocarro Expresso");
  }

  public int getNumeroPassageiros() {
    return numeroPassageiros;
  }

  public boolean hasAvaria() {
    return this.avaria;
  }
}
