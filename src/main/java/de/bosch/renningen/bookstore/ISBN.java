package de.bosch.renningen.bookstore;

public class ISBN {
  private int language;
  private int publisher;
  private int book;
  private int checksum;

  public ISBN(int language, int publisher, int book) {
    this.language = language;
    this.publisher = publisher;
    this.book = book;

    this.checksum = calcualteChecksum(language, publisher, book);
  }

  public ISBN(int language, int publisher, int book, int checksum) {
    this.language = language;
    this.publisher = publisher;
    this.book = book;
    this.checksum = checksum;

    validateChecksum(language, publisher, book, checksum);
  }

  private void validateChecksum(int language, int publisher, int book, int checksum) {
    if (checksum != calcualteChecksum(language, publisher, book)) {
      throw new IllegalArgumentException("Invalid checksum. was " + checksum + " expected ");
    }
  }

  private int calcualteChecksum(int language, int publisher, int book) {
    return language + publisher + book;
  }

  public int getLanguage() {
    return language;
  }

  public int getPublisher() {
    return publisher;
  }

  public int getBook() {
    return book;
  }

  public int getChecksum() {
    return checksum;
  }

  public String format() {
    return language + "-" + publisher + "-" + book + "-" + checksum;
  }
}
