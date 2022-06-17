package models.Autocarros;

import models.Cidades.Cidade;

import java.util.HashMap;
import java.util.List;

public class AutocarroConvencional extends Autocarros {

  public AutocarroConvencional(int currentLocation, int busID, List<List> cidades) {
    super(51, 1, currentLocation, busID, cidades);
  }

}
