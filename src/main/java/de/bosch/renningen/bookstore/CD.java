package de.bosch.renningen.bookstore;

public class CD extends Media {
  private double length;

  public CD(String title, ISBN isbn) {
    super(title, isbn);
  }

  @Override
  public double getPrice() {
    return 15.0;
  }

  public double getLength() {
    return length;
  }
}
