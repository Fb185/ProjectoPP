package views;

import java.io.*;
import java.util.Scanner;

import controllers.Controller;

public class Cli {
  String line = "";
  String splitBy = ",";
  private String quantity;
  private String startingCity;
  private String type;
  private String passageirosCascais;
  private String passageirosLisboa;
  private String passageirosCoimbra;
  private String passageirosPorto;
  private String passageirosBraga;
  // What

  private Controller controller;

  public Cli() throws FileNotFoundException {
    controller = new Controller();
    File file = new File("src/main/java/config.csv");
    try (Scanner sc = new Scanner(file)) {
      while (sc.hasNextLine()) {
        String[] cutLine = sc.nextLine().split(" ");
        switch (cutLine[0]) {
          case "Bus" -> {

            this.quantity = cutLine[1];
            this.startingCity = cutLine[2];
            this.type = cutLine[3];
            controller.createAutocarro(type, startingCity, quantity);
          }
          case "Passageiros" -> {
            this.passageirosCascais = cutLine[1];
            this.passageirosLisboa = cutLine[2];
            this.passageirosCoimbra = cutLine[3];
            this.passageirosPorto = cutLine[4];
            this.passageirosBraga = cutLine[5];
            controller.createCities(passageirosCascais, passageirosLisboa,
                passageirosCoimbra, passageirosPorto,
                passageirosBraga);
            // TODO refractor

          }

        }
      }
      if (!controller.enoughBuses()) {

        System.out.println("Simulacao NAO iniciada: Autocarros insuficientes");
      } else if (!controller.enoughPassengers()) {
        // TODO adicionar not (!)
        System.out.println("Simulacao NAO iniciada: Passageiros insuficientes\n");

      } else {
        controller.simular();
        controller.anomaly();
        controller.checkEnd();
      }
    } catch (IndexOutOfBoundsException e) {
      e.printStackTrace();
    }

  }
}
