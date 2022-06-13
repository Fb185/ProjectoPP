package models.Autocarros;

import models.Cidades.Cidade;
import models.Passageiro;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Autocarros implements Runnable{
  final int maxPassageiros;
  private int busID;
  private boolean moving = false;
  private boolean avaria = false;
  private double speed;
  private String currentLocation;

  private List<Integer> avarias = Arrays.asList(100, 200, 300, 500, 1000);

  private List<String> cidades = Arrays.asList("Lisboa", "Porto", "Cascais", "Braga", "Coimbra");
  private Boolean goingForward;

  private HashMap<String, Cidade> cidadeMap;

  private HashMap<String, ArrayList<Passageiro>> passageiros;
  private Integer numeroPassageiros;

  private Boolean isRunning;

  public Autocarros(int maxPassageiros, double speed, String currentLocation, int busID, HashMap<String, Cidade> cidadesMap) {
    this.maxPassageiros = maxPassageiros;
    this.speed = speed;
    this.currentLocation = currentLocation;
    this.busID = busID;
    this.isRunning = true;
    this.goingForward = true;
    this.cidadeMap = cidadesMap;
    this.passageiros = new HashMap<>();
    this.numeroPassageiros = 0;
  }

  public int getBusID() {
    return this.busID;
  }

  public void setCurrentLocation(String currentLocation) {
    this.currentLocation = currentLocation;
  }

  public String getCurrentLocation() {
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

  @Override
  public void run() {
    while(isRunning){
      System.out.println(this.cidades.contains(this.currentLocation));
      if(this.cidades.contains(this.currentLocation)){
        //TODO
        //Logica dentro da cidade

        try {
          System.out.println(busID + " está em " + this.currentLocation);
          TimeUnit.MILLISECONDS.sleep(1000);
          if(this.passageiros.get(this.currentLocation).size() > 0){
            this.passageiros.put(this.currentLocation, new ArrayList<Passageiro>());
          }
          while(this.numeroPassageiros < this.maxPassageiros){
            Passageiro passageiro = this.cidadeMap.get(this.currentLocation).getPassageiro();
            this.passageiros.get(passageiro.getCidadeDestino()).add(passageiro);
          }
          System.out.println(this.busID + " saiu de " + this.currentLocation);

        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }

      }
      else {
        //Avaria
        double chanceDeAvaria = ThreadLocalRandom.current().nextDouble();
        int tempoDeAvaria = 0;
        if(chanceDeAvaria < 0.1) {
          Random rand = new Random();
          tempoDeAvaria = this.avarias.get(rand.nextInt(this.avarias.size()));
        }
        //

        try {
          System.out.println(this.busID + "esta a mudar de cidade");
          TimeUnit.MILLISECONDS.sleep(1000 + tempoDeAvaria);
          System.out.println(this.busID + "está a chegar na cidade");
          this.currentLocation = this.cidades.get(this.cidades.indexOf(this.currentLocation)+1);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }

        //TODO
        //"dormir" o tempo que a thread precisa
        //if ( houver alguma avaria, adicionar ao tempo do percurso )
        break;
      }
    }
  }
}
