package controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import models.*;
import models.Autocarros.*;
import models.Cidades.*;

public class Controller {
  private int busID = 0;
  private Timer anomaly = new Timer();

  private List<Passageiro> cascaisPassengers = new ArrayList<>();
  private List<Passageiro> lisboaPassangers = new ArrayList<>();
  private List<Passageiro> coimbraPassengers = new ArrayList<>();
  private List<Passageiro> portoPassengers = new ArrayList<>();
  private List<Passageiro> bragaPassengers = new ArrayList<>();
  private List<List> cidades = Arrays.asList(cascaisPassengers, lisboaPassangers, coimbraPassengers, portoPassengers,
      bragaPassengers);

  private HashMap<Integer, Autocarros> autocarrosHashMap;
  Funcionario funcionario;

  public Controller() {
    this.funcionario = new Funcionario();
    this.autocarrosHashMap = new HashMap<>();
  }

  public void createCities(String passageirosCascais, String passageirosLisboa, String passageirosCoimbra,
      String passageirosPorto,
      String passageirosBraga) {
    List<String> destinos = new ArrayList<String>();
    destinos.add("Cascais");
    destinos.add("Lisboa");
    destinos.add("Coimbra");
    destinos.add("Porto");
    destinos.add("Braga");

    for (int i = 0; i < Integer.parseInt(passageirosCascais); i++) {
      var city = destinos.get(0);
      destinos.remove(city);
      String destination = destinos.get(new Random().nextInt(destinos.size()));
      destinos.add(0, city);
      Passageiro p = new Passageiro(destination);
      cidades.get(0).add(p);
    }
    for (int i = 0; i < Integer.parseInt(passageirosLisboa); i++) {
      var city = destinos.get(1);
      destinos.remove(city);
      String destination = destinos.get(new Random().nextInt(destinos.size()));
      destinos.add(1, city);
      Passageiro p = new Passageiro(destination);
      cidades.get(1).add(p);
    }
    for (int i = 0; i < Integer.parseInt(passageirosCoimbra); i++) {
      var city = destinos.get(2);
      destinos.remove(city);
      String destination = destinos.get(new Random().nextInt(destinos.size()));
      destinos.add(2, city);
      Passageiro p = new Passageiro(destination);
      cidades.get(2).add(p);
    }
    for (int i = 0; i < Integer.parseInt(passageirosPorto); i++) {
      var city = destinos.get(3);
      destinos.remove(city);
      String destination = destinos.get(new Random().nextInt(destinos.size()));
      destinos.add(3, city);
      Passageiro p = new Passageiro(destination);
      cidades.get(3).add(p);
    }
    for (int i = 0; i < Integer.parseInt(passageirosBraga); i++) {
      var city = destinos.get(4);
      destinos.remove(city);
      String destination = destinos.get(new Random().nextInt(destinos.size()));
      destinos.add(4, city);
      Passageiro p = new Passageiro(destination);
      cidades.get(4).add(p);
    }

  }

  public void createAutocarro(String tipoAutocarro, String cidade, String quantidade) {
    int busses = Integer.parseInt(quantidade);
    int cityPosition = 0;
    switch (cidade) {
      case "Cascais" -> {
        cityPosition = 0;
      }
      case "Lisboa" -> {
        cityPosition = 1;
      }
      case "Coimbra" -> {
        cityPosition = 2;
      }
      case "Porto" -> {
        cityPosition = 3;
      }
      case "Braga" -> {
        cityPosition = 4;
      }
    }
    for (int i = 0; i < busses; i++) {
      busID++;
      if (tipoAutocarro.equals("Convencional")) {
        AutocarroConvencional autocarroConvencional = new AutocarroConvencional(cityPosition, busID, cidades);
        autocarrosHashMap.put(busID, autocarroConvencional);
        System.out.println("Autocarro Convencional ligado | ID: " + busID);
        // funcionario.adicionarNovaThread(autocarroConvencional);
      } else if (tipoAutocarro.equals("Expresso")) {
        AutocarroExpresso autocarroExpresso = new AutocarroExpresso(cityPosition, busID, cidades);
        autocarrosHashMap.put(busID, autocarroExpresso);
        System.out.println("Autocarro Expresso ligado | ID: " + busID);
      } else if (tipoAutocarro.equals("LongDrive")) {
        AutocarroLongDrive autocarroLongDrive = new AutocarroLongDrive(cityPosition, busID, cidades);
        autocarrosHashMap.put(busID, autocarroLongDrive);
        System.out.println("Autocarro Long-Drive ligado | ID: " + busID);
      } else if (tipoAutocarro.equals("Minibus")) {
        AutocarroMiniBus autocarroMiniBus = new AutocarroMiniBus(cityPosition, busID, cidades);
        autocarrosHashMap.put(busID, autocarroMiniBus);
        System.out.println("Autocarro Minibus ligado | ID: " + busID);
      }
    }
  }

  public void simular() {
    for (Map.Entry<Integer, Autocarros> entry : autocarrosHashMap.entrySet()) {
      entry.getValue().start();
    }

  }

  public void anomaly() {
    int timeToStart = new Random().nextInt(4, 30);
    TimerTask tt = new TimerTask() {
      public void run() {
        int randBusId = new Random().nextInt(autocarrosHashMap.size()) + 1;
        var affectedBus = autocarrosHashMap.get(randBusId);
        synchronized (affectedBus) {
          try {
            // TODO add log to bus of anomaly
            System.out.println("\nOcorreu uma anomalia....\n");
            System.out.println("Autocarro " + affectedBus.getBusID() + ": esta na shit ");

            affectedBus.suspend();
            Thread.sleep(new Random().nextInt(5000, 10000)); // bus sleeps for random time between 5 and 10 seconds
            affectedBus.resume();

            System.out.println("\n....terminou a anomalia\n");
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    };
    anomaly.scheduleAtFixedRate(tt, timeToStart * 1000, 15000);

  }

  public boolean enoughBuses() {
    return autocarrosHashMap.size() >= 1 && autocarrosHashMap.size() <= 10;
  }

  public boolean enoughPassengers() {
    int minimumPassengers = 0;
    int currentPassengers = 0;
    for (Map.Entry<Integer, Autocarros> entry : autocarrosHashMap.entrySet()) {
      minimumPassengers += entry.getValue().getMaxPassageiros();
    }
    for (int i = 0; i < cidades.size(); i++) {
      currentPassengers += cidades.get(i).size();
    }
    return currentPassengers >= minimumPassengers;
  }

  public void checkEnd() {
    Timer t1 = new Timer();
    t1.scheduleAtFixedRate(new TimerTask() {
      @Override
      public void run() {
        int numPassengers = 0;
        for (Map.Entry<Integer, Autocarros> entry : autocarrosHashMap.entrySet()) {
          numPassengers += entry.getValue().getNumeroPassageiros();
          // ID of bus and passengers it has
          // System.out.println(entry.getValue().getBusID());
          // System.out.println(numPassengers);
        }
        if (numPassengers == 0) {
          for (Map.Entry<Integer, Autocarros> entry : autocarrosHashMap.entrySet()) {
            entry.getValue().stop();
            anomaly.cancel();
            anomaly.purge();
          }

          System.out.println("All passengers have arrived to their respective destinations");
          System.out.println("TERMINATING in: 5s");
          try {
            Thread.sleep(1000);
            System.out.println("TERMINATING in: 4s");
            Thread.sleep(1000);
            System.out.println("TERMINATING in: 3s");
            Thread.sleep(1000);
            System.out.println("TERMINATING in: 2s");
            Thread.sleep(1000);
            System.out.println("TERMINATING in: 1s");
            Thread.sleep(1000);
            System.exit(0);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }

    }, 100, 100);

  }

}
