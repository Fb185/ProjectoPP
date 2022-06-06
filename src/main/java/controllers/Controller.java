package controllers;

import models.*;

public class Controller {
  public Controller() {
    System.out.println("Controller created");
  }

  public void CreateBus() {
    Autocarros newBus = new Autocarros(51, 10);
    System.out.println("Bus created\n");
  }
}
