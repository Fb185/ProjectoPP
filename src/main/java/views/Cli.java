package views;

import java.io.*;
import java.util.Scanner;

import controllers.Controller;

public class Cli {
  private String quantity;
  private String startingCity;
  private String type;
  private String passageirosCascais;
  private String passageirosLisboa;
  private String passageirosCoimbra;
  private String passageirosPorto;
  private String passageirosBraga;

  private Controller controller;

  public Cli() throws FileNotFoundException {
    // instantiate controller to have acess to methods
    controller = new Controller();
    // path to configuration file
    File file = new File("src/main/java/config.csv");
    // I chose to implement the sorting of instructions this way because it allows
    // me to both have the number of buses in the same line or
    // in two different lines for example:
    // Bus 4 Cascais Convencional
    // or
    // Bus 1 Cascais Convencional
    // Bus 1 Cascais Convencional
    // Bus 1 Cascais Convencional
    // Bus 1 Cascais Convencional
    // the same logic goes for passengers
    try (Scanner sc = new Scanner(file)) {
      while (sc.hasNextLine()) {
        String[] cutLine = sc.nextLine().split(" ");
        switch (cutLine[0]) {
          case "Bus" -> {
            this.quantity = cutLine[1];
            this.startingCity = cutLine[2];
            this.type = cutLine[3];
            // busses are created according too the value recieved from scanner
            controller.createAutocarro(type, startingCity, quantity);
          }
          case "Passageiros" -> {
            this.passageirosCascais = cutLine[1];
            this.passageirosLisboa = cutLine[2];
            this.passageirosCoimbra = cutLine[3];
            this.passageirosPorto = cutLine[4];
            this.passageirosBraga = cutLine[5];
            // citties are created and populated with the respective ammount of passengers
            // to each
            controller.createCities(passageirosCascais, passageirosLisboa,
                passageirosCoimbra, passageirosPorto,
                passageirosBraga);
          }
        }
      }
      // Check if the ammount of busses and passengers is within the specifications of
      // the project
      if (!controller.enoughBuses()) { // goTo definition
        System.out.println("Simulacao NAO iniciada: Autocarros insuficientes");
      } else if (!controller.enoughPassengers()) { // goTo definition
        System.out.println("Simulacao NAO iniciada: Passageiros insuficientes\n");

      } else {
        // initiate the simulation as well as anomalies and a check to see if all
        // passengers have arrived their destinations
        controller.simular();
        controller.anomaly();
        controller.checkEnd();
      }
    } catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
    }

  }
}
