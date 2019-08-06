package de.bosch.renningen.exceptions;

import java.io.IOException;

public class ExceptionTests {
  public static void main(String[] args) {
    try {
      doWork();
    }
    catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }

  private static void doWork() {
    try {
      String checksum = calculateCheckSum("a");
      System.out.println("checksum = " + checksum);
      //Continue with work
      System.out.println("checksum.length() = " + checksum.length());
      return;
    }
    catch (IOException | MyException e) {
      throw new RuntimeException("My message", e);
    }
  }

  private static String calculateCheckSum(String string) throws IOException {
    if (string.length() < 3) {
      throw new IOException("asdf");
    }

    //Complex calculation of checksum
    return string.substring(0, 3);
  }
}
