package models;

public class Passageiro {
  private String cidadeDestino;

  public Passageiro(String cidadeDestino) {
    this.cidadeDestino = cidadeDestino;
  }

  public String getCidadeDestino() {
    return cidadeDestino;
  }

  @Override
  public String toString() {
    return "[" + cidadeDestino + "]";
  }
}
