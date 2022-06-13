package controllers;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import models.*;
import models.Autocarros.*;
import models.Cidades.*;

public class Controller {
  private int busID = 0;

  HashMap<String, Cidade> cidades;
  private HashMap<Integer, Autocarros> autocarrosHashMap;
  Funcionario funcionario;

  public Controller(){
    this.funcionario = new Funcionario();
    this.autocarrosHashMap = new HashMap<>();
    this.cidades = new HashMap<>() ;
  }

  public void createCities(int passageirosCascais, int passageirosLisboa, int passageirosCoimbra, int passageirosPorto,
      int passageirosBraga) {
    cidades.put("Cascais", new Cascais(passageirosCascais));
    cidades.put("Lisboa", new Lisboa(passageirosLisboa));
    cidades.put("Coimbra", new Coimbra(passageirosCoimbra));
    cidades.put("Porto", new Porto(passageirosPorto));
    cidades.put("Braga", new Braga(passageirosBraga));
  }

  public void createAutocarro(String tipoAutocarro, String nomeCidade, int quantidade) {
    for (int i=0; i< quantidade; i++){
      busID++;
      if(tipoAutocarro.equals("Convencional")){
        AutocarroConvencional autocarroConvencional = new AutocarroConvencional(nomeCidade, busID, cidades);
        autocarrosHashMap.put(busID, autocarroConvencional);
        funcionario.adicionarNovaThread(autocarroConvencional);
        // TODO ver melhor depois
        //cidades.get(nomeCidade);
      }
      else if (tipoAutocarro.equals("Expresso")) {
        AutocarroExpresso autocarroExpresso = new AutocarroExpresso(nomeCidade, busID, cidades);
        autocarrosHashMap.put(busID, autocarroExpresso);
      }
      else if (tipoAutocarro.equals("LongDrive")) {
        AutocarroLongDrive autocarroLongDrive = new AutocarroLongDrive(nomeCidade, busID, cidades);
        autocarrosHashMap.put(busID, autocarroLongDrive);
      }
      else if (tipoAutocarro.equals("Minibus")) {
        AutocarroMiniBus autocarroMiniBus = new AutocarroMiniBus(nomeCidade, busID, cidades);
        autocarrosHashMap.put(busID, autocarroMiniBus);
      }
    }
  }

  public void simular(){
    try {
      TimeUnit.MILLISECONDS.sleep(3000);
      this.autocarrosHashMap.get(1).stopRunning();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
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
