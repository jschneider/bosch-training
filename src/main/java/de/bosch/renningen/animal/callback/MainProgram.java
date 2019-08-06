package de.bosch.renningen.animal.callback;

public class MainProgram {
  public static void main(String[] args) {
    Agent agent = new Agent();

    //Programmteil UI
    HappinessListener listener = new MyHappinessListener();

    agent.addListener(listener);

    //Anonyme Klasse
    agent.addListener(new HappinessListener() {
      @Override
      public void happinessChanged(Agent source, double oldHappiness, double updatedHappiness) {
        System.out.println("happinessChanged - Output aus anonymer Klasse");
      }
    });
    agent.addListener((source, oldHappiness, updatedHappiness) -> System.out.println("happinessChanged - Output aus anonymer Klasse"));


    //Programmteil calculations
    agent.setHappiness(0.5);
    agent.setHappiness(0.1);
    agent.setHappiness(0.0);
    agent.setHappiness(1.0);

  }
}
