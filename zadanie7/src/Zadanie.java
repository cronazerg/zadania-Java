import java.net.*;
import java.io.*;

public class Zadanie {
  public static void main(String[] args) {
    String nazwahosta;

    if (args.length > 0) {
      nazwahosta = args[0];
    } else {
      nazwahosta = "time.nist.gov";
    }

    try {
      Socket gniazdo = new Socket(nazwahosta, 37);
      InputStream strumien = gniazdo.getInputStream();
      long czas = 0;
      for (int i = 0; i < 4; i++) {
        czas = (czas << 8) | strumien.read();
      }
      gniazdo.close();

      //format czas
      long sekundy = czas % 60;
      long minuty = (czas / 60) % 60;
      long godziny = (czas / 3600) % 24;
      long dni = (czas / 86400) % 365;
      long lata = (czas / 31536000);

      //format czasu: Czas serwera time.nist.gov: 123 lat 102 dni 10 godziny 39 minuty59 sekundy
      System.out.println("Czas serwera " + nazwahosta + ": " + lata + " lat " + dni + " dni " + godziny + " godziny " + minuty + " minuty " + sekundy + " sekundy");

    } catch (IOException e) {
      System.err.println(e);
    }
  }

}