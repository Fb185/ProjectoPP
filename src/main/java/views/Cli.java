package views;

import controllers.*;

public class Cli {
  public Cli() {

    Controller controller = new Controller();
    System.out.println("DEBUG: from CLI");

    controller.CreateBus();
  }

}
