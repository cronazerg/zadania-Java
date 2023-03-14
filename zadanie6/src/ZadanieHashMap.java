public class ZadanieHashMap {
  public static void main(String args[]) {
    KolejkaHashMap k = new KolejkaHashMap();
    WatekHashMap w1 = new WatekHashMap(k, "klucz1", 1);
    WatekHashMap w2 = new WatekHashMap(k, "klucz2", 2);

    w1.start();
    w2.start();

    try {
      w1.join();
      w2.join();
    } catch (InterruptedException e) {
    }

    Integer wartosc = k.pobierz("klucz1");
    while (wartosc != null) {
      System.out.println(wartosc.toString());
      wartosc = k.pobierz("klucz2");
    }
  }
}