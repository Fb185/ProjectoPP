package models.Autocarros;
//TODO comentar tudo

//TODO fazer metodo (ou classe) que le autocarros e println(display output) a cada segundo ou 100 milis

import models.Passageiro;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Autocarros extends Thread {
  final int maxPassageiros;
  private int busID;
  private boolean moving = false;
  private boolean avaria = false;
  private double speed;
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
    this.speed = speed;
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

  public void setCurrentLocation(int currentLocation) {
    this.currentLocation = currentLocation;
  }

  public int getCurrentLocation() {
    return currentLocation;
  }

  public int getNumeroPassageiros() {
    return this.numeroPassageiros;
  }

  public boolean hasAvaria() {
    return this.avaria;
  }

  public double getSpeed() { // i am speed
    return this.speed;
  }

  public void addPassageiro() {
    this.numeroPassageiros++;
  }

  public void removePassageiro() {
    this.numeroPassageiros--;
  }

  public boolean isMoving() {
    return this.moving;
  }

  public void stopRunning() {
    isRunning = false;
  }

  public void nextStop() {
    if (currentLocation == 4) {
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
      // System.out.println(passengersInBus);
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
    // System.out.println(passengersInBus);
    offloadPassengers();
    // System.out.println(passengersInBus);
    loadPassengers();
    // System.out.println(passengersInBus);

    // System.out.println(currentLocation);
    // System.out.println("\nautocarro " + busID + " Load, Unload");
    // System.out.println("Cidades");
    // System.out.println(passengerCities.get(0).toString());
    // System.out.println(passengerCities.get(1).toString());
    // System.out.println(passengerCities.get(2).toString());
    // System.out.println(passengerCities.get(3).toString());
    // System.out.println(passengerCities.get(4).toString());
  }

  public void onTheMove() {

    for (int i = 0; i < 5; i++) {
      try {
        // Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5001));
        Thread.sleep(100);

        // TODO refractor this
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
      // System.out.println(this.cidades.get(currentLocation));
      // System.out.println(this.currentLocation);
      managePassengers();
      nextStop();
      onTheMove();
      // "dormir" o tempo que a thread precisa
      // if ( houver alguma avaria, adicionar ao tempo do percurso )
    }
  }
}
