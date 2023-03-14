public class QuadraticEquation {
  private double a, b, c;

  public QuadraticEquation(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public void setCoefficients(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public double getY(double x) {
    return a * x * x + b * x + c;
  }

  public int getNumberOfRoots() {
    double delta = b * b - 4 * a * c;
    if (delta < 0) {
      return 0;
    } else if (delta == 0) {
      return 1;
    } else {
      return 2;
    }
  }
}