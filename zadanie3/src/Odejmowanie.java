public class Odejmowanie extends Wierzcholek {
  private int a, b;
  public Odejmowanie(int x, int y) {
    a = x;
    b = y;
  }
  private int oblicz() {
    return a - b;
  }

  @Override
  public int wartosc() {
    return oblicz();
  }
}
