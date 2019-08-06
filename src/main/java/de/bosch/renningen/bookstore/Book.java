package de.bosch.renningen.bookstore;

public class Book extends Media {
  private final Author author;
  private final int edition;
  private final double price;

  public Book(String title, Author author, int edition, ISBN isbn, double price) {
    super(title, isbn);
    this.author = author;
    this.edition = edition;
    this.price = price;
  }

  public int getEdition() {
    return edition;
  }

  public Author getAuthor() {
    return author;
  }

  @Override
  public double getPrice() {
    return price;
  }
}
