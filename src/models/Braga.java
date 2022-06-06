package models;

class Braga {
  private String name = "Braga";
  private int passageirosNaEstacao;
  private int autocarrosNaEstacao;

  public Braga() {
    System.out.println("Estacao Braga Operacional");
  }

  public String getName() {
    return this.name;
  }

  public int getPassageirosNaEstacao() {
    return this.passageirosNaEstacao;
  }

  public int getAutocarrosNaEstacao() {
    return this.autocarrosNaEstacao;
  }

}
