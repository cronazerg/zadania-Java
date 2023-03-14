import java.util.*;
//Tu wstaw zmodyfikowaną klasę przechowującą współrzędne punktu
public class Zadanie2 {
  public static void main(String[] args) {
    HashMap mapa = new HashMap();
    mapa.put(new Wspolrzedna2(2, 3), new String("czerwony"));
    mapa.put(new Wspolrzedna2(-3, 0), new String("czarny"));
    mapa.put(new Wspolrzedna2(-1, 2), new String("czerwony"));
    mapa.put(new Wspolrzedna2(2, -1), new String("czarny"));
    Wspolrzedna2 w = new Wspolrzedna2(-1, 2);
    System.out.println("Punkt " + w.toString()
        + " ma kolor " + mapa.get(w));
  }
}