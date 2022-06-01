class AutocarroConvencional {
  final int maxPassageiros = 51;
  private int numeroPassageiros = 0;
  private boolean avaria = false;

  AutocarroConvencional() {
    System.out.println("Autocarro Convencional");
  }

  public int getNumeroPassageiros() {
    return this.numeroPassageiros;
  }

  public boolean hasAvaria() {
    return this.avaria;
  }
}
