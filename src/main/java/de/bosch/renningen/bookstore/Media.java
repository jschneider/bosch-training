package de.bosch.renningen.bookstore;

public abstract class Media {
  private final String title;
  private final ISBN isbn;

  public Media(String title, ISBN isbn) {
    this.title = title;
    this.isbn = isbn;
  }

  public ISBN getIsbn() {
    return isbn;
  }

  public String getTitle() {
    return title;
  }

  public abstract double getPrice();
}
