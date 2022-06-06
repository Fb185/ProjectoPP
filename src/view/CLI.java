package view;

import controller.Controller;
import models.*;

public class CLI {
  public static void main(String[] args) {
    Controller newcontroller = new Controller();
    AutocarroConvencional newConvencional = new AutocarroConvencional();
    AutocarroExpresso newExpresso = new AutocarroExpresso();
    AutocarroLongDrive newLongDrive = new AutocarroLongDrive();
    AutocarroMiniBus newMiniBus = new AutocarroMiniBus();
    Porto porto = new Porto();
    Lisboa lisboa = new Lisboa();
    Cascais cascais = new Cascais();
    Coimbra coimbra = new Coimbra();
    Braga braga = new Braga();
  }
}
