package models;

class Porto {
  private String name = "Porto";
  private int passageirosNaEstacao;
  private int autocarrosNaEstacao;

  public Porto() {
    System.out.println("Estacao Porto Operacional");
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
