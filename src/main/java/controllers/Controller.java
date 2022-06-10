package controllers;

import java.util.HashMap;

import models.*;

public class Controller {
  private int busID = 0;

  HashMap<String, Cidade> cidades = new HashMap<String, Cidade>();
  Funcionario funcionario = new Funcionario();

  public void createCities(int passageirosCascais, int passageirosLisboa, int passageirosCoimbra, int passageirosPorto,
      int passageirosBraga) {
    cidades.put("Cascais", new Cascais(passageirosCascais));
    cidades.put("Lisboa", new Lisboa(passageirosLisboa));
    cidades.put("Coimbra", new Coimbra(passageirosCoimbra));
    cidades.put("Porto", new Porto(passageirosPorto));
    cidades.put("Braga", new Braga(passageirosBraga));

  }

  public void createConvencionalLisboa(int quantity) {
    for (int i = 0; i < quantity; i++) {
      busID++;
      AutocarroConvencional newConvencional = new AutocarroConvencional("Lisboa", busID);

      // autocarroConvencional.start();
      System.out.println("Autocarro Convencional Ligado");
    }
  }

  public void createExpressoLisboa(int quantity) {
    for (int i = 0; i < quantity; i++) {
      busID++;
      Autocarros autocarroExpresso = new Autocarros(69, 9, "Lisboa", busID);
      // autocarroExpresso.start();
      System.out.println("Autocarro Expresso Ligado");
    }
  }

  public void createMiniBusLisboa(int quantity) {
    for (int i = 0; i < quantity; i++) {
      busID++;
      Autocarros autocarroMiniBus = new Autocarros(24, 3, "Lisboa", busID);
      // autocarroMiniBus.start();
      System.out.println("Autocarro Mini-Bus Ligado");
    }
  }

  public void createLongDriveLisboa(int quantity) {
    for (int i = 0; i < quantity; i++) {
      busID++;
      Autocarros autocarroLongDrive = new Autocarros(59, 14, "Lisboa", busID);
      // autocarroLongDrive.start();
      System.out.println("Autocarro Long Drive Ligado");
    }
  }

  public void createConvencionalCascais(int quantity) {
    for (int i = 0; i < quantity; i++) {
      busID++;
      Autocarros autocarroConvencional = new Autocarros(51, 1, "Cascais", busID);
      // autocarroConvencional.start();
      System.out.println("Autocarro Convencional Ligado");
    }
  }

  public void createExpressoCascais(int quantity) {
    for (int i = 0; i < quantity; i++) {
      busID++;
      Autocarros autocarroExpresso = new Autocarros(69, 9, "Cascais", busID);
      // autocarroExpresso.start();
      System.out.println("Autocarro Expresso Ligado");
    }
  }

  public void createMiniBusCascais(int quantity) {
    for (int i = 0; i < quantity; i++) {
      busID++;
      Autocarros autocarroMiniBus = new Autocarros(24, 3, "Cascais", busID);
      // autocarroMiniBus.start();
      System.out.println("Autocarro Mini-Bus Ligado");
    }
  }

  public void createLongDriveCascais(int quantity) {
    for (int i = 0; i < quantity; i++) {
      busID++;
      Autocarros autocarroLongDrive = new Autocarros(59, 14, "Cascais", busID);
      // autocarroLongDrive.start();
      System.out.println("Autocarro Long Drive Ligado");
    }
  }

  public void createConvencionalCoimbra(int quantity) {
    for (int i = 0; i < quantity; i++) {
      busID++;
      Autocarros autocarroConvencional = new Autocarros(51, 1, "Coimbra", busID); // Autocarros(MAXPAX, S, "CoimbraPEED)
      // autocarroConvencional.start();
      System.out.println("Autocarro Convencional Ligado");
    }
  }

  public void createExpressoCoimbra(int quantity) {
    for (int i = 0; i < quantity; i++) {
      busID++;
      Autocarros autocarroExpresso = new Autocarros(69, 9, "Coimbra", busID);
      // autocarroExpresso.start();
      System.out.println("Autocarro Expresso Ligado");
    }
  }

  public void createMiniBusCoimbra(int quantity) {
    for (int i = 0; i < quantity; i++) {
      busID++;
      Autocarros autocarroMiniBus = new Autocarros(24, 3, "Coimbra", busID);
      // autocarroMiniBus.start();
      System.out.println("Autocarro Mini-Bus Ligado");
    }
  }

  public void createLongDriveCoimbra(int quantity) {
    for (int i = 0; i < quantity; i++) {
      busID++;
      Autocarros autocarroLongDrive = new Autocarros(59, 14, "Coimbra", busID);
      // autocarroLongDrive.start();
      System.out.println("Autocarro Long Drive Ligado");
    }
  }

  public void createConvencionalPorto(int quantity) {
    for (int i = 0; i < quantity; i++) {
      busID++;
      Autocarros autocarroConvencional = new Autocarros(51, 1, "Porto", busID); // Autocarros(MAXPAX, SPEED, "Porto")
      // autocarroConvencional.start();
      System.out.println("Autocarro Convencional Ligado");
    }
  }

  public void createExpressoPorto(int quantity) {
    for (int i = 0; i < quantity; i++) {
      busID++;
      Autocarros autocarroExpresso = new Autocarros(69, 9, "Porto", busID);
      // autocarroExpresso.start();
      System.out.println("Autocarro Expresso Ligado");
    }
  }

  public void createMiniBusPorto(int quantity) {
    for (int i = 0; i < quantity; i++) {
      busID++;
      Autocarros autocarroMiniBus = new Autocarros(24, 3, "Porto", busID);
      // autocarroMiniBus.start();
      System.out.println("Autocarro Mini-Bus Ligado");
    }
  }

  public void createLongDrivePorto(int quantity) {
    for (int i = 0; i < quantity; i++) {
      busID++;
      Autocarros autocarroLongDrive = new Autocarros(59, 14, "Porto", busID);
      // autocarroLongDrive.start();
      System.out.println("Autocarro Long Drive Ligado");
    }
  }

  public void createConvencionalBraga(int quantity) {
    for (int i = 0; i < quantity; i++) {
      busID++;
      Autocarros autocarroConvencional = new Autocarros(51, 1, "Braga", busID); // Autocarros(MAXPAX, SPEED, "Braga")
      // autocarroConvencional.start();
      System.out.println("Autocarro Convencional Ligado");
    }
  }

  public void createExpressoBraga(int quantity) {
    for (int i = 0; i < quantity; i++) {
      busID++;
      Autocarros autocarroExpresso = new Autocarros(69, 9, "Braga", busID);
      // autocarroExpresso.start();
      System.out.println("Autocarro Expresso Ligado");
    }
  }

  public void createMiniBusBraga(int quantity) {
    for (int i = 0; i < quantity; i++) {
      busID++;
      Autocarros autocarroMiniBus = new Autocarros(24, 3, "Braga", busID);
      // autocarroMiniBus.start();
      System.out.println("Autocarro Mini-Bus Ligado");
    }
  }

  public void createLongDriveBraga(int quantity) {
    for (int i = 0; i < quantity; i++) {
      busID++;
      Autocarros autocarroLongDrive = new Autocarros(59, 14, "Braga", busID);
      // autocarroLongDrive.start();
      System.out.println("Autocarro Long Drive Ligado");
    }
  }

  // public void listBus() {
  // // busMap.forEach((k, v) -> System.out.println("key: " + k + " | value: " +
  // v));
  // }

  // public void getAllpax() {
  // busMap.forEach((k, v) -> System.out.println("Bus: " + k + " | Passageiros: "
  // + v.getNumeroPassageiros()));
  // }

  // public void getAllAvaria() {
  // busMap.forEach((k, v) -> System.out.println("Bus: " + k + " | Avaria: " +
  // v.hasAvaria()));
  // }

  // public void getAllSpeed() { // returns the speeds of all busses
  // busMap.forEach((k, v) -> System.out.println("Bus: " + k + " | Speed: " +
  // v.getSpeed()));
  // }

  // public void getAllLocation() { // returns the speeds of all busses
  // busMap.forEach((k, v) -> System.out.println("Bus: " + k + " | Location: " +
  // v.getCurrentLocation()));
  // }

  // public float getPax(int busID) {
  // // System.out.println("GETSPEED DEBUG");
  // return busMap.get(busID).getNumeroPassageiros();
  // }

  // public boolean hasAvaria(int busID) {
  // // System.out.println("HASAVARIA DEBUG");
  // return busMap.get(busID).hasAvaria();
  // }

  // public float getSpeed(int busID) {
  // // System.out.println("GETSPEED DEBUG");
  // return busMap.get(busID).getSpeed();
  // }

  // public String getCurrentLocation(int busID) {
  // return busMap.get(busID).getCurrentLocation();
  // }

}
