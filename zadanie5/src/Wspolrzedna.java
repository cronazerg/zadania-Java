class Wspolrzedna implements Comparable<Wspolrzedna> {
  private int x, y;

  public Wspolrzedna(int _x, int _y) {
    x = _x;
    y = _y;
  }

  public String toString() {
    return "(" + x + ", " + y + ")";
  }

  @Override
  public int compareTo(Wspolrzedna o) {
    if (x == o.x) {
      return y - o.y;
    } else {
      return x - o.x;
    }
  }
}