import java.util.Objects;

class Wspolrzedna2 {
  private int x, y;

  public Wspolrzedna2(int _x, int _y) {
    x = _x;
    y = _y;
  }

  public String toString() {
    return "(" + x + ", " + y + ")";
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Wspolrzedna2 wspolrzedna = (Wspolrzedna2) obj;
    return x == wspolrzedna.x && y == wspolrzedna.y;
  }
}