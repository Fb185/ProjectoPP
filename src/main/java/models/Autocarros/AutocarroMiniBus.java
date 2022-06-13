package models.Autocarros;

import models.Cidades.Cidade;

import java.util.HashMap;

public class AutocarroMiniBus extends Autocarros {

  public AutocarroMiniBus(String currentLocation, int busID, HashMap<String, Cidade> cidadesMap) {
    super(24, 1, currentLocation, busID, cidadesMap);
  }
}
