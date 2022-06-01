class AutocarroMiniBus {
  final int maxPassageiros = 24;
  private int numeroPassagerios = 0;
  private boolean avaria = false;

  AutocarroMiniBus() {
    System.out.println("Autocarro Mini bus");
  }

  public int getNumeroPassageiros() {
    return this.numeroPassagerios;
  }

  public boolean hasAvaria() {
    return this.avaria;
  }
}
