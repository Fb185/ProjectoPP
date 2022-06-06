package controllers;

import models.*;

public class Controller {

  public void createConvencional() {
    Autocarros autocarroConvencional = new Autocarros(51, 10);
    autocarroConvencional.start();
    System.out.println("convencional created");
  }

  public void createExpresso() {
    Autocarros autocarroExpresso = new Autocarros(69, 8);
    autocarroExpresso.start();
    System.out.println("Expresso created");
  }

  public void createMiniBus() {
    Autocarros autocarroMiniBus = new Autocarros(24, 8);
    autocarroMiniBus.start();
    System.out.println("Mini Bus created");
  }

  public void createLongDrive() {
    Autocarros autocarroLongDrive = new Autocarros(59, 8);
    autocarroLongDrive.start();
    System.out.println("Long Drive created");
  }

}
