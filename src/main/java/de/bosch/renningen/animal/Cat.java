package de.bosch.renningen.animal;

public class Cat extends Animal implements KannLautGeben {
  public Cat(String name) {
    super(name);
  }

  @Override
  public void gibLaut() {
    System.out.println("Miau");
  }
}
