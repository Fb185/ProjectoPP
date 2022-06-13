package models.Autocarros;

import models.Cidades.Cidade;

import java.util.HashMap;

public class AutocarroExpresso extends Autocarros {

  public AutocarroExpresso(String currentLocation, int busID, HashMap<String, Cidade> cidadesMap) {
    super(69, 1, currentLocation, busID, cidadesMap);
  }
}
