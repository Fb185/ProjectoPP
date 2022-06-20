package models.Autocarros;

import java.util.List;

public class AutocarroMiniBus extends Autocarros {

  public AutocarroMiniBus(int currentLocation, int busID, List<List> cidades) {
    super(24, 1, currentLocation, busID, cidades);
  }
}
