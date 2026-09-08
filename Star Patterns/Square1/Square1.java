package Star;

public class Square1 {

    // n! (long use kiya taaki bade n pe jaldi overflow na ho)
    public static long factorial(int n) {
        long f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    // nCr, factorial ke bina taaki overflow na ho
    public static long binomialCoefficient(int n, int r) {
        if (r < 0 || r > n) {
            return 0;
        }
        r = Math.min(r, n - r);
        long result = 1;
        for (int i = 1; i <= r; i++) {
            result = result * (n - r + i) / i;
        }
        return result;
    }

    // Method overloading
    public static int calc(int a, int b) {
        return a + b;
    }

    public static int calc(int a, int b, int c) {
        return a + b + c;
    }

    public static float calc(float a, float b) {
        return a + b;
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 2 se n tak ke saare primes print karta hai
    public static void printPrimes(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void binaryToDecimal(int binary) {
        int original = binary;
        int place = 1;
        int decimal = 0;
        while (binary > 0) {
            int lastDigit = binary % 10;
            decimal += lastDigit * place;
            place *= 2;
            binary /= 10;
        }
        System.out.println("Decimal of " + original + " = " + decimal);
    }

    public static void decimalToBinary(int n) {
        int original = n;
        long place = 1;
        long binary = 0;
        while (n > 0) {
            binary += (n % 2) * place;
            place *= 10;
            n /= 2;
        }
        System.out.println("Binary of " + original + " = " + binary);
    }

    public static void hollowRectangle(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("calc(2, 3) = " + calc(2, 3));
        System.out.println("calc(2, 3, 4) = " + calc(2, 3, 4));
        System.out.println("calc(2.5f, 3.5f) = " + calc(2.5f, 3.5f));

        System.out.println("5! = " + factorial(5));
        System.out.println("5C2 = " + binomialCoefficient(5, 2));

        System.out.println("Primes up to 20:");
        printPrimes(20);

        binaryToDecimal(1011);
        decimalToBinary(11);

        hollowRectangle(4, 5);
    }
}