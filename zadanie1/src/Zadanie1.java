import java.math.BigInteger;
import javax.swing.JOptionPane;


public class Zadanie1 {
  public static void main(String[] args) {
    //Zadanie 1.1
    String input = JOptionPane.showInputDialog(null, "Wpisz tekst:");
    String upperCaseInput = input.toUpperCase();
    JOptionPane.showMessageDialog(null, "Tekst w wielkich literach:\n" + upperCaseInput);

    // Zadanie 1.2
    String input2 = JOptionPane.showInputDialog(null, "Podaj liczbę całkowitą:");
    BigInteger n = new BigInteger(input2);
    BigInteger factorial = BigInteger.ONE;
    for (BigInteger i = BigInteger.ONE; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
      factorial = factorial.multiply(i);
    }
    JOptionPane.showMessageDialog(null, "Silnia z " + n + " wynosi:\n" + factorial);

    //Zadanie 1.3
    String input3 = JOptionPane.showInputDialog(null, "Podaj liczbę całkowitą:");
    int n1 = Integer.parseInt(input3);
    int sum = 0;
    for (int i = 1; i <= n1; i += 2) {
      sum += i;
      if (i == n1) {
        break;
      }
      else if (i == n1 - 1) {
        break;
      }
    }
    JOptionPane.showMessageDialog(null, "Suma liczb nieparzystych od 1 do " + n1 + " wynosi:\n" + sum);

    //Zadanie 1.4
    String input4 = JOptionPane.showInputDialog(null, "Podaj liczbę:");
    int n2 = Integer.parseInt(input3);
    System.out.println("Liczba " + n + " w systemie binarnym: " + Zadanie1.toBinary(n2));
    System.out.println("Liczba " + n + " w systemie ósemkowym: " + Zadanie1.toOctal(n2));
    System.out.println("Liczba " + n + " w systemie szesnastkowym: " + Zadanie1.toHexadecimal(n2));
  }

  public static String toBinary(int n) {
    return Integer.toBinaryString(n);
  }

  public static String toOctal(int n) {
    return Integer.toOctalString(n);
  }

  public static String toHexadecimal(int n) {
    return Integer.toHexString(n);
  }
}
