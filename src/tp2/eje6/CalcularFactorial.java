package tp2.eje6;

import java.math.BigInteger;

public class CalcularFactorial {

    public double factorial(double n) { //da infinito con un numero muy grande
        if (n == 1.0)
            return 1.0;
        else
            return n * factorial(n - 1);

    }

    public BigInteger factorialbig(int n) {
        if (BigInteger.valueOf(n).equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        } else
            return BigInteger.valueOf(n).multiply(factorialbig(n - 1));
    }
}
