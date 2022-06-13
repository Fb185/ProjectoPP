package models;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Autocarros implements Runnable{
  final int maxPassageiros;
  private int busID;
  private boolean moving = false;
  private int numeroPassageiros = 0;
  private boolean avaria = false;
  private int speed;
  private String currentLocation;

  private String[] cidades = {"Lisboa", "Porto", "Cascais", "Braga", "Coimbra"};

  private Boolean isRunning;

  public Autocarros(int maxPassageiros, int speed, String currentLocation, int busID) {
    this.maxPassageiros = maxPassageiros;
    this.speed = speed;
    this.currentLocation = currentLocation;
    this.busID = busID;
    this.isRunning = true;
  }

  public int getBusID() {
    return this.busID;
  }

  public void setCurrentLocation(String currentLocation) {
    this.currentLocation = currentLocation;
  }

  public String getCurrentLocation() {
    if (this.moving) {
      return "Bus is on the move";
    } else {
      return currentLocation;
    }

  }

  public int getNumeroPassageiros() {
    return this.numeroPassageiros;
  }

  public boolean hasAvaria() {
    return this.avaria;
  }

  public float getSpeed() { // i am speed
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

  @Override
  public void run() {
    while(isRunning){
      if(Arrays.asList(this.cidades).contains(this.currentLocation)){
        //TODO
        //Logica dentro da cidade

        try {
          TimeUnit.MILLISECONDS.sleep(1000);
          System.out.println("Eu estou a correr");
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }

      }
      else {
        //TODO
        //"dormir" o tempo que a thread precisa
        //if ( houver alguma avaria, adicionar ao tempo do percurso )
        break;
      }
    }
  }
}
