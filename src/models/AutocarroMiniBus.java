class AutocarroMiniBus {
  final int maxPassageiros = 24;
  private int numeroPassagerios = 0;
  private boolean avaria = false;
  private float speed;

  AutocarroMiniBus() {
    System.out.println("Autocarro Mini bus");
  }

  public int getNumeroPassageiros() {
    return this.numeroPassagerios;
  }

  public boolean hasAvaria() {
    return this.avaria;
  }

  public void startEngine() {
    System.out.println("Engine Started");
  }
}
