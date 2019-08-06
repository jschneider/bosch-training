package de.bosch.renningen.animal.callback;

import java.util.ArrayList;
import java.util.List;

public class Agent {
  private double happiness;

  public double getHappiness() {
    return happiness;
  }

  public void setHappiness(double happiness) {
    double old = this.happiness;
    this.happiness = happiness;

    for (HappinessListener listener : listeners) {
      listener.happinessChanged(this, old, happiness);
    }
  }

  private final List<HappinessListener> listeners = new ArrayList<>();

  public void addListener(HappinessListener listener) {
    listeners.add(listener);
  }

  public void removeListener(HappinessListener listener) {
    listeners.remove(listener);
  }
}
