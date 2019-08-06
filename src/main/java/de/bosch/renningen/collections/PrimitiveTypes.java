package de.bosch.renningen.collections;

/**
 * @author Johannes Schneider (<a href="mailto:js@cedarsoft.com">js@cedarsoft.com</a>)
 */
public class PrimitiveTypes {
  public static void main(String[] args) {
    //Primitive Daten-Typen
    int i = 789;

    long l = 5L; //suffix "L" macht es zu einem long

    //Widening geht automatisch (es erfolgt aber eine Konvertierung!)
    long l2 = i;

    //Konvertieren braucht "Gewalt"
    //Sieht aus wie ein Cast, ist aber eine Konvertierung
    long l3 = (long) i;


    //
    //Boxed types
    //

    Integer i1 = 789;
    Integer i2 = 5;

    //null-Referenz ist möglich
    Integer i3 = null;

    Integer resultObject = i1 + i2;

    //Vorsicht! impliziertes unboxing kann zu NullPointerExceptions führen!
    int b = resultObject;
  }
}
