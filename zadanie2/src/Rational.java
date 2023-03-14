import java.math.BigInteger;

public class Rational implements Comparable<Rational> {
  private final BigInteger numerator;
  private final BigInteger denominator;

  public Rational(int numerator, int denominator) {
    if (denominator == 0) {
      throw new IllegalArgumentException("Denominator cannot be zero");
    }
    if (denominator < 0) {
      numerator = -numerator;
      denominator = -denominator;
    }
    BigInteger gcd = BigInteger.valueOf(numerator).gcd(BigInteger.valueOf(denominator));
    this.numerator = BigInteger.valueOf(numerator).divide(gcd);
    this.denominator = BigInteger.valueOf(denominator).divide(gcd);
  }

  public Rational add(Rational arg) {
    BigInteger num = this.numerator.multiply(arg.denominator).add(arg.numerator.multiply(this.denominator));
    BigInteger den = this.denominator.multiply(arg.denominator);
    return new Rational(num.intValue(), den.intValue());
  }

  public Rational mul(Rational arg) {
    BigInteger num = this.numerator.multiply(arg.numerator);
    BigInteger den = this.denominator.multiply(arg.denominator);
    return new Rational(num.intValue(), den.intValue());
  }

  public Rational sub(Rational arg) {
    BigInteger num = this.numerator.multiply(arg.denominator).subtract(arg.numerator.multiply(this.denominator));
    BigInteger den = this.denominator.multiply(arg.denominator);
    return new Rational(num.intValue(), den.intValue());
  }

  public Rational div(Rational arg) {
    BigInteger num = this.numerator.multiply(arg.denominator);
    BigInteger den = this.denominator.multiply(arg.numerator);
    return new Rational(num.intValue(), den.intValue());
  }

  public boolean equals(Rational arg) {
    return this.numerator.multiply(arg.denominator).equals(this.denominator.multiply(arg.numerator));
  }

  public int compareTo(Rational arg) {
    BigInteger num1 = this.numerator.multiply(arg.denominator);
    BigInteger num2 = arg.numerator.multiply(this.denominator);
    return num1.compareTo(num2);
  }

  public String toString() {
    if (denominator.intValue() == 1) {
      return numerator.toString();
    } else {
      return numerator.toString() + "/" + denominator.toString();
    }
  }
}
