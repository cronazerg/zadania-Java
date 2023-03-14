public class FunkcjaKwadratowa extends Wielomian {
  private double a;
  private double b;
  private double c;

  public FunkcjaKwadratowa(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public void wypiszMiejscaZerowe() {
    double delta = b*b - 4*a*c;

    if (delta < 0) {
      System.out.println("brak");
    } else if (delta == 0) {
      System.out.println(-b/(2*a));
    } else {
      System.out.println((-b - Math.sqrt(delta))/(2*a) + " " + (-b + Math.sqrt(delta))/(2*a));
    }
  }
}