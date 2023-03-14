public class FunkcjaLiniowa extends Wielomian {
  private double a;
  private double b;

  public FunkcjaLiniowa(double a, double b) {
    this.a = a;
    this.b = b;
  }

  public void wypiszMiejscaZerowe() {
    System.out.println(-b/a);
  }
}
