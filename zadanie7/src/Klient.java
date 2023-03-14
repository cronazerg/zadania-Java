import java.io.*;
import java.net.*;

public class Klient {
  public static void main(String[] args) {
    try {
      // Nawiązanie połączenia z serwerem
      Socket polaczenie = new Socket("localhost", 9696);
      BufferedReader in = new BufferedReader(
          new InputStreamReader(polaczenie.getInputStream()));
      PrintWriter out = new PrintWriter(polaczenie.getOutputStream(), true);

      // Oczekiwanie na wiadomość OK od serwera
      String odpowiedz = in.readLine();
      if (odpowiedz.equals("OK.")) {
        System.out.println("Polaczono z serwerem.");
      }

      // Pobranie od użytkownika numeru pola i przesłanie go do serwera
      BufferedReader klawiatura = new BufferedReader(
          new InputStreamReader(System.in));
      String wejscie;
      while ((wejscie = klawiatura.readLine()) != null) {
        out.println(wejscie);

        // Odebranie od serwera liczby określającej ilość min wokół pola
        odpowiedz = in.readLine();
        if (odpowiedz.equals("bum")) {
          System.out.println("Trafiłeś na minę!");
          break;
        } else {
          System.out.println("Liczba min wokół pola: " + odpowiedz);
        }

        // Sprawdzenie warunku zakończenia pętli
        if (odpowiedz.equals("0")) {
          System.out.println("Gratulacje, odkryłeś wszystkie wolne pola!");
          break;
        }
      }

      // Zamknięcie połączenia
      polaczenie.close();
    } catch (IOException e) {
      System.err.println("Błąd połączenia z serwerem: " + e);
    }
  }
}