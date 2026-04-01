package org.example;


abstract class Bike {

  void run() {
    System.out.println("abc");
  }
}

interface Car{
  void run();
}

public class Interface extends Bike implements Car{


  public static void main(String args[]) {
    Bike obj = new Interface();
    obj.run();
  }

  @Override
  public void run() {
    System.out.println("a");
  }
}
