
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Rational r1 = new Rational(1, 2);
    System.out.println(r1);

    QuadraticEquation eq = new QuadraticEquation(1, -11, 52);
    double y = eq.getY(2);
    int roots = eq.getNumberOfRoots();
    System.out.println(y);
    System.out.println(roots);

    FunkcjaKwadratowa fk = new FunkcjaKwadratowa(-18, 2, 33);
    fk.wypiszMiejscaZerowe();
  }
}

