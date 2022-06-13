package models.Cidades;

import models.Passageiro;

import java.lang.reflect.Array;
import java.util.*;

public class Cidade {
  private String name;
  private int passageirosNaEstacao;

  private ArrayList<Passageiro> passageiroList;

  public Cidade(String name, int passageirosNaEstacao) {
    this.name = name;
    this.passageirosNaEstacao = passageirosNaEstacao;
    this.passageiroList = new ArrayList<Passageiro>();
    List cidades = Arrays.asList("Lisboa", "Porto", "Cascais", "Braga", "Coimbra");
    for(int i = 0; i < passageirosNaEstacao; i++){
      Random rand = new Random();
      String cidade = (String) cidades.get(rand.nextInt(cidades.size()));
      Passageiro passageiro = new Passageiro(cidade);
      this.passageiroList.add(passageiro);
    }
  }


  public String getName() {
    return this.name;
  }

  public int getPassageirosNaEstacao() {
    return this.passageirosNaEstacao;
  }

  public Passageiro getPassageiro() {
    return this.passageiroList.remove(this.passageiroList.size());
  }

  // public int getautoCarrosNaEstacao() {
  // return this.autoCarrosNaEstacao;
  // }



}
