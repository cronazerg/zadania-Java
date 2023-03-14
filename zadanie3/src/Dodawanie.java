public class Dodawanie extends Wierzcholek {
  private int a, b;
  public Dodawanie(int x, int y) {
    a = x;
    b = y;
  }
  private int oblicz() {

    return (int) (a + b);
  }

  @Override
  public int wartosc() {
    return oblicz();
  }
}
