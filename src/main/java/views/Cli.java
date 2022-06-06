package views;

import controllers.*;

public class Cli {
  public Cli() {

    Controller controller = new Controller();

    controller.createExpresso();
    controller.createMiniBus();
    controller.createConvencional();
    controller.createLongDrive();
  }

}
