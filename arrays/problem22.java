import java.math.BigInteger;

class BigNumberFactorial {
    public static void factorial(int number) {
        BigInteger fact = BigInteger.valueOf(1);
        for (int i = 2; i <= number; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        factorial(17);
    }
}