class WatekHashMap extends Thread {
  private KolejkaHashMap kolejka;
  private String klucz;
  private int wartosc;

  public WatekHashMap(KolejkaHashMap kol, String k, int w) {
    kolejka = kol;
    klucz = k;
    wartosc = w;
  }

  public void run() {
    try {
      kolejka.dodaj(klucz, wartosc);
      Thread.sleep(50);
    } catch (InterruptedException e) {}
  }
}
