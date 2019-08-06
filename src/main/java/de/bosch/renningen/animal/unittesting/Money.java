package de.bosch.renningen.animal.unittesting;

public class Money {
  private final double value;

  public Money(double value) {
    this.value = value;
  }

  public double getValue() {
    return value;
  }

  public Money add(Money other) {
    return new Money(value + other.value);
  }
}
