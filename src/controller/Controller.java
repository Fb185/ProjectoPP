package controller;

import controller.Controller;
import models.*;

public class Controller {

  public AutocarroExpresso createAutocarroExpresso() {
    AutocarroExpresso newExpresso = new AutocarroExpresso();
  }

  AutocarroConvencional newConvencional = new AutocarroConvencional();
  AutocarroLongDrive newLongDrive = new AutocarroLongDrive();
  AutocarroMiniBus newMiniBus = new AutocarroMiniBus();
  Porto porto = new Porto();
  Lisboa lisboa = new Lisboa();
  Cascais cascais = new Cascais();
  Coimbra coimbra = new Coimbra();
  Braga braga = new Braga();

  public Controller() {
    System.out.println("Controller created");
  }
}
