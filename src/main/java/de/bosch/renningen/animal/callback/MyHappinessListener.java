package de.bosch.renningen.animal.callback;

public class MyHappinessListener implements HappinessListener {
  @Override
  public void happinessChanged( Agent source, double oldHappiness, double updatedHappiness ) {
    System.out.println("Happiness Changed");
  }
}
