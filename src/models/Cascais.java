package models;

public class Cascais {
  private String name = "Cascais";
  private int passageirosNaEstacao;
  private int autocarrosNaEstacao;

  public Cascais() {
    System.out.println("Estacao Cascais Operacional");
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
