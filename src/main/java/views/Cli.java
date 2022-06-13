package views;

import java.io.*;

import controllers.Controller;

public class Cli {
  String line = "";
  String splitBy = ",";

  //What
  private int convencionalCascais;
  private int convencionalLisboa;
  private int convencionalCoimbra;
  private int convencionalPorto;
  private int convencionalBraga;

  private int expressoCascais;
  private int expressoLisboa;
  private int expressoCoimbra;
  private int expressoPorto;
  private int expressoBraga;

  private int miniBusCascais;
  private int miniBusLisboa;
  private int miniBusCoimbra;
  private int miniBusPorto;
  private int miniBusBraga;

  private int longDriveCascais;
  private int longDriveLisboa;
  private int longDriveCoimbra;
  private int longDrivePorto;
  private int longDriveBraga;

  private int passageirosCascais;
  private int passageirosLisboa;
  private int passageirosCoimbra;
  private int passageirosPorto;
  private int passageirosBraga;
  private int numeroAvarias;
  private int intensidadeTransito;

  private Controller controller;

  public Cli() {

    controller = new Controller();

    controller.createCities(10, 10, 10, 10, 10);

    controller.createAutocarro("Convencional", "Cascais", 1);
    controller.createAutocarro("Expresso", "Cascais", 1);
    controller.createAutocarro("LongDrive", "Cascais", 1);
    controller.createAutocarro("Minibus", "Cascais", 1);
    controller.simular();


  }


}
