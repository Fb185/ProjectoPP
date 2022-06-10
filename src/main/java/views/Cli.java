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
    BufferedReader br = new BufferedReader(new FileReader("src/main/java/config.csv"));

    while ((line = br.readLine()) != null) {

      final String[] data = line.split(splitBy);
      final int[] opt = new int[data.length];

      for (int i = 0; i < data.length; i++) {
        opt[i] = Integer.valueOf(data[i]);
        System.out.println(opt[i]);
      }

      convencionalCascais = opt[0];
      expressoCascais = opt[1];
      longDriveCascais = opt[2];
      miniBusCascais = opt[3];

      convencionalLisboa = opt[4];
      expressoLisboa = opt[5];
      longDriveLisboa = opt[6];
      miniBusLisboa = opt[7];

      convencionalCoimbra = opt[8];
      expressoCoimbra = opt[9];
      longDriveCoimbra = opt[10];
      miniBusCoimbra = opt[11];

      convencionalPorto = opt[12];
      expressoPorto = opt[13];
      longDrivePorto = opt[14];
      miniBusPorto = opt[15];

      convencionalBraga = opt[16];
      expressoBraga = opt[17];
      longDriveBraga = opt[18];
      miniBusBraga = opt[19];

      passageirosCascais = opt[20];
      passageirosLisboa = opt[21];
      passageirosCoimbra = opt[22];
      passageirosPorto = opt[23];
      passageirosBraga = opt[24];
      numeroAvarias = opt[25];
      intensidadeTransito = opt[26];
      br.close();

    }
    controller.createCities(passageirosCascais, passageirosLisboa, passageirosCoimbra, passageirosPorto,
        passageirosBraga);
    controller.createConvencionalCascais(convencionalCascais);
    controller.createConvencionalLisboa(convencionalLisboa);
    controller.createConvencionalCoimbra(convencionalCoimbra);
    controller.createConvencionalPorto(convencionalPorto);
    controller.createConvencionalBraga(convencionalBraga);

    controller.createExpressoCascais(expressoCascais);
    controller.createExpressoLisboa(expressoLisboa);
    controller.createExpressoCoimbra(expressoCoimbra);
    controller.createExpressoPorto(expressoPorto);
    controller.createExpressoBraga(expressoBraga);

    controller.createMiniBusCascais(miniBusCascais);
    controller.createMiniBusLisboa(miniBusLisboa);
    controller.createMiniBusCoimbra(miniBusCoimbra);
    controller.createMiniBusPorto(miniBusPorto);
    controller.createMiniBusBraga(miniBusBraga);

    controller.createLongDriveCascais(longDriveCascais);
    controller.createLongDriveLisboa(longDriveLisboa);
    controller.createLongDriveCoimbra(longDriveCoimbra);
    controller.createLongDrivePorto(longDrivePorto);
    controller.createLongDriveBraga(longDriveBraga);
  }

  // these should be for funcionario
  // System.out.println(controller.hasAvaria(1));

}
