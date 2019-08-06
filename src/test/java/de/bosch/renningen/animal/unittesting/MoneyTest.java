package de.bosch.renningen.animal.unittesting;

import org.junit.*;

/**
 * @author Johannes Schneider (<a href="mailto:js@cedarsoft.com">js@cedarsoft.com</a>)
 */
public class MoneyTest {
  @Test
  public void testEquals() {
    Money money = new Money(1.23);

    Assert.assertEquals(1.23, money.getValue(), 0.0);
    Assert.assertEquals(1.9, money.add(new Money(0.67)).getValue(), 0.0);

    //TODO Grenzen testen, negative Zahlen testen, 0 testen...
  }
}
