package views;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import controllers.*;

public class Cli {
  public Cli() throws IOException {

    Controller controller = new Controller();
    BufferedReader csvReader = new BufferedReader(new FileReader("src/main/java/config.csv"));
    String row;
    while ((row = csvReader.readLine()) != null) {
      String[] data = row.split(",");
      for (int i = 0; i < data.length; i++) {
        System.out.println(data[i]);
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
    // // controller.listBus();
    // controller.getAllSpeed();
    // controller.getAllpax();
    // controller.getAllAvaria();
    // controller.getPax(1);
    // System.out.println(controller.hasAvaria(1));

  }

}
