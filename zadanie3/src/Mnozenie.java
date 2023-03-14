public class Mnozenie extends Wierzcholek {
  private int a, b;
  public Mnozenie(int x, int y) {
    a = x;
    b = y;
  }
  private int oblicz() {
    return a * b;
  }

  @Override
  public int wartosc() {
    return oblicz();
  }
}
