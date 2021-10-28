import java.util.function.IntToDoubleFunction;

public class Bruch {
    private int numerator; // Zähler
    private int denominator; // Nenner

    public Bruch(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double toDecimal() {
        return numerator / ((double)denominator);
    }

    public String print() {
        return numerator + "/" + denominator;
    }

    public Bruch multiplicate(Bruch b2) {
        return new Bruch(this.numerator * b2.getNumerator(), this.denominator * b2.getDenominator());
    }

    public Bruch multiplicate(Bruch b2,  Bruch b3) {
        return new Bruch(this.numerator * b2.getNumerator() * b3.getNumerator(), this.denominator * b2.getDenominator() * b3.getDenominator());
    }
}
