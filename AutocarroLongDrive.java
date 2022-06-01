class AutocarroLongDrive {
  final int maxPassageiros = 24;
  private int numeroPassageiros = 0;
  private boolean avaria = false;

  AutocarroLongDrive() {
    System.out.println("Autocarro Long Drive");
  }

  public int getNumeroPassageiros() {
    return this.numeroPassageiros;
  }

  public boolean hasAvarai() {
    return this.avaria;
  }
}