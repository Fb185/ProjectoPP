package views;

import java.io.*;

import controllers.Controller;

public class Cli {
  String line = "";
  String splitBy = ",";
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
  private Controller controller;

  private int passageirosCascais;
  private int passageirosLisboa;
  private int passageirosCoimbra;
  private int passageirosPorto;
  private int passageirosBraga;
  private int numeroAvarias;
  private int intensidadeTransito;

  public Cli() throws IOException {

    controller = new Controller();

    controller.createCities(passageirosCascais, passageirosLisboa, passageirosCoimbra, passageirosPorto,
        passageirosBraga);
    //controller.createConvencionalCascais(convencionalCascais);
    //controller.createConvencionalLisboa(convencionalLisboa);
    //controller.createConvencionalCoimbra(convencionalCoimbra);
    //controller.createConvencionalPorto(convencionalPorto);
    //controller.createConvencionalBraga(convencionalBraga);
//
    //controller.createExpressoCascais(expressoCascais);
    //controller.createExpressoLisboa(expressoLisboa);
    //controller.createExpressoCoimbra(expressoCoimbra);
    //controller.createExpressoPorto(expressoPorto);
    //controller.createExpressoBraga(expressoBraga);
//
    //controller.createMiniBusCascais(miniBusCascais);
    //controller.createMiniBusLisboa(miniBusLisboa);
    //controller.createMiniBusCoimbra(miniBusCoimbra);
    //controller.createMiniBusPorto(miniBusPorto);
    //controller.createMiniBusBraga(miniBusBraga);
//
    //controller.createLongDriveCascais(longDriveCascais);
    //controller.createLongDriveLisboa(longDriveLisboa);
    //controller.createLongDriveCoimbra(longDriveCoimbra);
    //controller.createLongDrivePorto(longDrivePorto);
    //controller.createLongDriveBraga(longDriveBraga);

    controller.createAutocarro("Convencional", "Cascais", 1);
    controller.simular();


  }

  // these should be for funcionario
  // System.out.println(controller.hasAvaria(1));

}
