package models;

class Lisboa {
  private String name = "Lisboa";
  private int passageirosNaEstacao;
  private int autocarrosNaEstacao;

  public Lisboa() {
    System.out.println("Estacao Lisboa Operacional");
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
