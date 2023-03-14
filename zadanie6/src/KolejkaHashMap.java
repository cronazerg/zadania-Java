import java.util.HashMap;

class KolejkaHashMap {
  private HashMap<String, Integer> mapa = new HashMap<>();

  public synchronized void dodaj(String klucz, Integer wartosc) {
    mapa.put(klucz, wartosc);
  }

  public synchronized Integer pobierz(String klucz) {
    return mapa.get(klucz);
  }
}
