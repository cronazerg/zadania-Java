class Wyrazenie {
  private final Wierzcholek korzen;
  private Wierzcholek utworzDrzewo(String w, int p, int q) {
    if (p == q) {
      return new Stala(Integer.parseInt(w.substring(p, p+1)));
    }
    int i = p;
    int l = 0;
    while (i <= q) {
      if (w.charAt(i) == '(') {
        ++l;
      } else if (w.charAt(i) == ')') {
        --l;
      } else if (l == 0) {
        if (w.charAt(i) == '+') {
          Wierzcholek w1 = utworzDrzewo(w, p, i-1);
          Wierzcholek w2 = utworzDrzewo(w, i+1, q);
          return new Dodawanie(w1.wartosc(), w2.wartosc());
        } else if (w.charAt(i) == '-') {
          Wierzcholek w1 = utworzDrzewo(w, p, i-1);
          Wierzcholek w2 = utworzDrzewo(w, i+1, q);
          return new Odejmowanie(w1.wartosc(), w2.wartosc());
        } else if (w.charAt(i) == '*') {
          Wierzcholek w1 = utworzDrzewo(w, p, i-1);
          Wierzcholek w2 = utworzDrzewo(w, i+1, q);
          return new Mnozenie(w1.wartosc(), w2.wartosc());
        }
      }
      ++i;
    }
    return utworzDrzewo(w, p+1, q-1);
  }
  public Wyrazenie(String w) {
    korzen = utworzDrzewo(w, 0, w.length()-1);
  }
  public int oblicz() {
    return korzen.wartosc();
  }
}
