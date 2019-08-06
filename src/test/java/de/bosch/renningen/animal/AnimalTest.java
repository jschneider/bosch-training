package de.bosch.renningen.animal;

public class AnimalTest {
  public static void main(String[] args) {
    Dog dog = new Dog("Wuffel", 6);
    Cat cat = new Cat("Blacky");

    System.out.println("gibLaut direkt auf der Variablen");
    dog.gibLaut();
    cat.gibLaut();

    //Compiler verifiziert die Existenz des Methode über das Interface
    //aber *nicht* welche konkrete Methodenimplementierung gewählt wird.
    //Die konkrete Methode wird erst zur Laufzeit anhand des konkreten Objekts aufgelöst
    KannLautGeben animal = dog;

    System.out.println("gibLaut direkt über Interface");
    animal.gibLaut();

    animal = cat;
    animal.gibLaut();
  }
}
