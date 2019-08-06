package de.bosch.renningen.animal.callback;

public interface HappinessListener {
  void happinessChanged( Agent source, double oldHappiness, double updatedHappiness );
}
