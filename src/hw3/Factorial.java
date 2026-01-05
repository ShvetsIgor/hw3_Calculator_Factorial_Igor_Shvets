package hw3;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);
//        if (num > 12) {
//            System.out.println("Factorial of " + num + " is too big, so we use BigInteger");
//            System.out.println("Result: " + factorialBigInt(num));
//        }
//        else {
//            System.out.println("Factorial of " + num + " is in Integer range");
//            System.out.println("Result: " + factorialInt(num));
//        }

        if (factorialInt(num) != -1) {
            System.out.println("Result: (int) " + factorialInt(num));
        }
        else {
            System.out.println("Result: (BigInt) " + factorialBigInt(num));
        }

//        System.out.println(factorialInt(num));
//        System.out.println(factorialBigInt(num));

    }

    public static int factorialInt(int num) {
        if (num == 0)
            return 1;
        if (num < 0)
            return -1;
        int res = 1;
        for (int i = 1; i <= num; i++) {
            if (res > Integer.MAX_VALUE / i)
                return -1;
            res *= i;
        }
        return res;
    }

    public static BigInteger factorialBigInt (int num) {
        if (num == 0)
            return BigInteger.ONE;
        if (num < 0)
            return BigInteger.valueOf(-1);
        BigInteger res = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}
