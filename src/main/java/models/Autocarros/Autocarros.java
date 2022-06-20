package models.Autocarros;

import models.Passageiro;
import java.util.*;

public class Autocarros extends Thread {
  final int maxPassageiros;
  private int busID;
  private int currentLocation;
  private List<String> cidades = Arrays.asList("Cascais", "Lisboa", "Coimbra", "Porto", "Braga");
  private List<List> passengerCities;
  private Boolean goingForward;
  private List<Passageiro> passengersInBus;
  private Integer numeroPassageiros;
  private Boolean isRunning;

  public Autocarros(int maxPassageiros, double speed, int currentLocation, int busID, List<List> cidades) {
    this.passengerCities = cidades;
    this.maxPassageiros = maxPassageiros;
    this.currentLocation = currentLocation;
    this.busID = busID;
    this.isRunning = true;
    this.goingForward = true;
    this.passengersInBus = new ArrayList();
    this.numeroPassageiros = 0;
  }

  public int getBusID() {
    return this.busID;
  }

  public int getNumeroPassageiros() {
    return this.numeroPassageiros;
  }

  public void nextStop() {
    if (currentLocation == 4) { // if its current location is the last stop then invert direction
      this.goingForward = false;
    }
    if (currentLocation == 0) {
      this.goingForward = true;
    }
    if (goingForward) {
      this.currentLocation++;
    } else {
      this.currentLocation--;
    }
  }

  public void offloadPassengers() {
    String myLocation = this.cidades.get(this.currentLocation);
    int count = 0;
    for (int i = 0; i < passengersInBus.size(); i++) {
      var p = passengersInBus.get(i);
      if (p.getCidadeDestino().matches(myLocation)) {
        count++;
        i--;
        passengersInBus.remove(p);
        this.numeroPassageiros--;
      }
    }
    System.out.println("autocarro " + busID + " | Descarregou " + count + " passageiros em " + myLocation);
  }

  public void loadPassengers() {
    String myLocation = this.cidades.get(this.currentLocation);
    int count = 0;
    synchronized (this.passengerCities) {
      List<Passageiro> passengers = this.passengerCities.get(this.currentLocation);
      for (int i = 0; i < passengers.size(); i++) {
        if (this.passengersInBus.size() == maxPassageiros) {
          break;
        }
        count++;
        i--;
        Passageiro p = passengers.get(0);
        this.passengersInBus.add(p);
        passengers.remove(p);
        this.numeroPassageiros++;
      }
      System.out.println("autocarro " + busID + " | Carregou " + count + " passageiros em " + myLocation);
    }
  }

  public int getMaxPassageiros() {
    return this.maxPassageiros;
  }

  public void managePassengers() {
    offloadPassengers();
    loadPassengers();
  }

  public void onTheMove() {
    for (int i = 0; i < 5; i++) {
      try {
        Thread.sleep(100);
        System.out.println("autocarro " + this.busID + " | Esta a " + (i + 1) + "/5 da viagem ate "
            + this.cidades.get(this.currentLocation));
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  @Override
  public void run() {
    while (isRunning) {
      managePassengers();
      nextStop();
      onTheMove();
    }
  }
}
