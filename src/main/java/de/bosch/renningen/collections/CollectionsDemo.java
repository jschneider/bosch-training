package de.bosch.renningen.collections;

import java.util.ArrayList;
import java.util.List;

import de.bosch.renningen.animal.Animal;
import de.bosch.renningen.animal.Cat;
import de.bosch.renningen.animal.Dog;

public class CollectionsDemo {
  public static void main(String[] args) {
    List<Dog> dogs = produceDogs();
    List<Cat> cats = produceCats();

    List<Animal> animals = new ArrayList<>();
    animals.addAll(dogs);
    animals.addAll(cats);

    printElements(dogs);
    printElements(cats);
    printElements(animals);

    addDog(dogs);
    //addDog(cats); //Das kompiliert *nicht*
    addDog(animals);
  }

  private static Integer indexof() {
    return null;
  }

  /**
   * Generics: Producer (Schreibzugriff auf Liste) benötigt "? super"
   */
  private static void addDog(List<? super Dog> dogs) {
    dogs.add(new Dog("asdf"));
  }

  private static List<Dog> produceDogs() {
    List<Dog> list = new ArrayList<>();

    list.add(new Dog("A"));
    list.add(new Dog("B"));
    list.add(new Dog("C"));

    return list;
  }

  private static List<Cat> produceCats() {
    List<Cat> list = new ArrayList<>();

    list.add(new Cat("A"));
    list.add(new Cat("B"));
    list.add(new Cat("C"));

    return list;
  }

  /**
   * Generics: Consumer (Lesezugriff auf Liste) benötigt "? extends"
   */
  public static void printElements(List<? extends Animal> elements) {
    for (Animal element : elements) {
      System.out.println("Element: " + element);
    }
  }
}
