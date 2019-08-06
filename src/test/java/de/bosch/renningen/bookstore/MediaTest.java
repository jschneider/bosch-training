package de.bosch.renningen.bookstore;

import org.junit.*;

public class MediaTest {
  @Test
  public void testBasics() {
    Book book = new Book("Grundgesetz",
                         new Author("Väter des Grundgesetzes"),
                         7,
                         new ISBN(3, 5343, 123123), 7.98);

    CD cd = new CD("Best of 80s", new ISBN(2, 234, 2222));

    Media media = book;

    //Der Methodenaufruf wird erst zur *Laufzeit* aufgelöst.
    //Es wird die Methode des tatsächlich referenzierten Objekts aufgerufen
    Assert.assertEquals("Grundgesetz", media.getTitle());
    Assert.assertEquals(7.98, media.getPrice(), 0.00);

    media = cd;

    //Der Methodenaufruf wird erst zur *Laufzeit* aufgelöst.
    //Jetzt ist es die CD, die von der Variablen "media" referenziert wird
    Assert.assertEquals("Best of 80s", media.getTitle());
    Assert.assertEquals(15.0, media.getPrice(), 0.0);
  }
}
