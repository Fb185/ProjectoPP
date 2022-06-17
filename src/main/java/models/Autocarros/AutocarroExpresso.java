package models.Autocarros;

import models.Cidades.Cidade;

import java.util.HashMap;
import java.util.List;

public class AutocarroExpresso extends Autocarros {

  public AutocarroExpresso(int currentLocation, int busID, List<List> cidades) {
    super(69, 1, currentLocation, busID, cidades);
  }
}
