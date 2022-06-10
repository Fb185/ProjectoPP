package models;

import java.util.HashMap;

public class Cidade {
  private String name;
  private int passageirosNaEstacao;

  public Cidade(String name, int passageirosNaEstacao) {
    this.name = name;
    this.passageirosNaEstacao = passageirosNaEstacao;
  }

  public String getName() {
    return this.name;
  }

  public int getPassageirosNaEstacao() {
    return this.passageirosNaEstacao;
  }

  // public int getautoCarrosNaEstacao() {
  // return this.autoCarrosNaEstacao;
  // }

}
