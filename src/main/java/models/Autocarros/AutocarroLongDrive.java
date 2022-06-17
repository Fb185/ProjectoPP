package models.Autocarros;

import models.Cidades.Cidade;

import java.util.HashMap;
import java.util.List;

public class AutocarroLongDrive extends Autocarros {
  public AutocarroLongDrive(int currentLocation, int busID, List<List> cidades) {
    super(59, 1.2, currentLocation, busID, cidades);
  }

}
