package models.Autocarros;

import models.Cidades.Cidade;

import java.util.HashMap;

public class AutocarroLongDrive extends Autocarros {
  public AutocarroLongDrive(String currentLocation, int busID, HashMap<String, Cidade> cidadesMap) {
    super(59, 1.2, currentLocation, busID, cidadesMap);
  }

}
