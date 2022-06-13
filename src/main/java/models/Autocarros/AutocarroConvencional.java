package models.Autocarros;

import models.Cidades.Cidade;

import java.util.HashMap;

public class AutocarroConvencional extends Autocarros {

  public AutocarroConvencional(String currentLocation, int busID, HashMap<String, Cidade> cidadesMap) {
    super(51, 1, currentLocation, busID, cidadesMap);
  }

}
