package models;

import java.util.HashMap;

public class Cidade {
  private String name;
  private int passageirosNaEstacao;
  private Autocarros autocarro;
  HashMap<Integer, AutocarroConvencional> convencionalMap = new HashMap<Integer, AutocarroConvencional>();
  HashMap<Integer, AutocarroExpresso> expressoMap = new HashMap<Integer, AutocarroExpresso>();
  HashMap<Integer, AutocarroLongDrive> longDriveMap = new HashMap<Integer, AutocarroLongDrive>();
  HashMap<Integer, AutocarroMiniBus> miniBusMap = new HashMap<Integer, AutocarroMiniBus>();

  public Cidade(String name, int passageirosNaEstacao) {
    this.name = name;
    this.passageirosNaEstacao = passageirosNaEstacao;
  }

  public void putConvencionalLisboa(Autocarros autocarro) {
    convencionalMap.put(autocarro.getBusID(), autocarro);
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
