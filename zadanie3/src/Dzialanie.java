class Dzialanie extends Wierzcholek {
  private char op; // operator +, -, / lub *

  public Dzialanie(char znak) {
    op = znak;
  }

  public void dodajLewyArg(Wierzcholek arg) {
    lewy = arg;
  }

  public void dodajPrawyArg(Wierzcholek arg) {
    prawy = arg;
  }

  public int wartosc() {
    int prawyWartosc = prawy.wartosc();
    if (op == '/' && prawyWartosc == 0) {
      throw new ArithmeticException("Dzielenie przez zero!");
    }
    int lewyWartosc = lewy.wartosc();
    switch (op) {
      case '+':
        return lewyWartosc + prawyWartosc;
      case '-':
        return lewyWartosc - prawyWartosc;
      case '/':
        return lewyWartosc / prawyWartosc;
      case '*':
        return lewyWartosc * prawyWartosc;
      default:
        throw new IllegalArgumentException("Niepoprawne wyrażenie!");
    }
  }
}