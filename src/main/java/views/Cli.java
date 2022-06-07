package views;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import controllers.*;

public class Cli {
  String numeroBusCascais;
  String numeroBusLisboa;
  String numeroBusCoimbra;
  String numeroBusPorto;
  String numeroBusBraga;
  String passageirosCascais;
  String passageirosLisboa;
  String passageirosCoimbra;
  String passageirosPorto;
  String passageirosBraga;
  int numeroAvarias;
  int intensidadeTransito;

  public Cli() throws IOException {

    Controller controller = new Controller();

    BufferedReader csvReader = new BufferedReader(new FileReader("src/main/java/config.csv"));
    String row;
    while ((row = csvReader.readLine()) != null) {
      String[] data = row.split(",");
      for (int i = 0; i < data.length; i++) {
        System.out.println(data[i]);
        data[0] = numeroBusCascais;
        data[1] = numeroBusLisboa;
        data[2] = numeroBusCoimbra;
        data[3] = numeroBusPorto;
        data[4] = numeroBusBraga;

        data[5] = passageirosCascais;
        data[6] = passageirosLisboa;
        data[7] = passageirosCoimbra;
        data[8] = passageirosPorto;
        data[9] = passageirosBraga;
        int numeroAvarias = Integer.valueOf(data[6]);
        int intensidadeTransito = Integer.valueOf(data[7]);

      }

      // do something with data
    }
    csvReader.close();

    // these should be for funcionario
    // controller.createConvencional();
    // controller.createExpresso();
    // controller.createMiniBus();
    // controller.createLongDrive();
    // controller.getAllLocation();
    // controller.listBus();
    // controller.getAllSpeed();
    // controller.getAllpax();
    // controller.getAllAvaria();
    // controller.getPax(1);
    // System.out.println(controller.hasAvaria(1));

  }

}
