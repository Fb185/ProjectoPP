package models;

public class Coimbra {
  private String name = "Coimbra";
  private int passageirosNaEstacao;
  private int autocarrosNaEstacao;

  public Coimbra() {
    System.out.println("Estacao Coimbra Operacional");
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
